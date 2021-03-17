package mc.thehealingangel.banners.common.tileentity;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.BannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class TriangleCutBannerTileEntity extends TileEntity implements INameable
{
    @Nullable
    private ITextComponent name;
    @Nullable
    private DyeColor baseColor = DyeColor.WHITE;
    /** A list of all the banner patterns. */
    @Nullable
    private ListNBT patterns;
    /** A list of all patterns stored on this banner. */
    @Nullable
    private List<Pair<BannerPattern, DyeColor>> patternList;

    public TriangleCutBannerTileEntity()
    {
        super(TileEntityTypeInit.TRIANGLE_CUT_BANNER.get());
        baseColor = DyeColor.WHITE;
    }

    public TriangleCutBannerTileEntity(@Nullable DyeColor color)
    {
        super(TileEntityTypeInit.TRIANGLE_CUT_BANNER.get());
        if (color == null)
            baseColor = DyeColor.WHITE;
        else
            baseColor = color;
    }

    @Override
    public ITextComponent getName()
    {
        if (name != null)
            return name;
        return (ITextComponent) new TranslationTextComponent("block.tha_banners." + baseColor.getName()+ "_banner");
    }

    @Nullable
    public ITextComponent getCustomName() {
        return name;
    }

    public void setName(ITextComponent name)
    {
        name = name;
    }

    @Override
    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);
        if (this.patterns != null)
            compound.put("Patterns", this.patterns);
        if (this.name != null)
            compound.putString("CustomName", ITextComponent.Serializer.toJson(this.name));
        return compound;
    }

    @Override
    public void read(CompoundNBT compound)
    {
        super.read(compound);
        if (compound.contains("CustomName", 8))
            name = ITextComponent.Serializer.fromJson(compound.getString("CustomName"));
        if (hasWorld())
            baseColor = ((AbstractBannerBlock)this.getBlockState().getBlock()).getColor();
        else
            baseColor = null;
        patterns = compound.getList("Patterns", 10);
        patternList = null;
    }

    /**
     * Retrieves packet to send to the client whenever this Tile Entity is resynced via World.notifyBlockUpdate. For
     * modded TE's, this packet comes back to you clientside in {\@link onDataPacket}
     */
    @Nullable
    @Override
    public SUpdateTileEntityPacket getUpdatePacket()
    {
        return new SUpdateTileEntityPacket(pos, -1, getUpdateTag());
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt)
    {
        read(pkt.getNbtCompound());
    }

    /**
     * Get an NBT compound to sync to the client with SPacketChunkData, used for initial loading of the chunk or when
     * many blocks change at once. This compound comes back to you clientside in {\@link handleUpdateTag}
     */
    @Override
    public CompoundNBT getUpdateTag()
    {
        return write(new CompoundNBT());
    }

    @Override
    public void handleUpdateTag(CompoundNBT tag)
    {
        read(tag);
    }

    /**
     * Retrieves the list of patterns for this tile entity. The banner data will be initialized/refreshed before this
     * happens.
     */
    @OnlyIn(Dist.CLIENT)
    public List<Pair<BannerPattern, DyeColor>> getPatternList()
    {
        if (patternList == null)
            patternList = makePatternList(baseColor, patterns);
        return patternList;
    }

    @OnlyIn(Dist.CLIENT)
    public static List<Pair<BannerPattern, DyeColor>> makePatternList(DyeColor color, @Nullable ListNBT listNBT)
    {
        List<Pair<BannerPattern, DyeColor>> list = Lists.newArrayList();
        list.add(Pair.of(BannerPattern.BASE, color));
        if (listNBT != null)
            for(int i = 0; i < listNBT.size(); ++i)
            {
                CompoundNBT compoundnbt = listNBT.getCompound(i);
                BannerPattern bannerpattern = BannerPattern.byHash(compoundnbt.getString("Pattern"));
                if (bannerpattern != null)
                    list.add(Pair.of(bannerpattern, DyeColor.byId(compoundnbt.getInt("Color"))));
            }
        return list;
    }

    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem(BlockState state)
    {
        ItemStack itemstack = new ItemStack(BannerBlock.forColor(getBaseColor(() -> state)));
        if (patterns != null && !patterns.isEmpty())
            itemstack.getOrCreateChildTag("BlockEntityTag").put("Patterns", patterns.copy());
        if (name != null)
            itemstack.setDisplayName(name);
        return itemstack;
    }

    public DyeColor getBaseColor(Supplier<BlockState> supplier)
    {
        if (baseColor == null)
            baseColor = ((AbstractBannerBlock)supplier.get().getBlock()).getColor();
        return baseColor;
    }
}
