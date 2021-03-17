package mc.thehealingangel.banners.common.block;

import mc.thehealingangel.banners.common.tileentity.TriangleCutBannerTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBannerBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class WallTriangleCutBannerBlock extends WallBannerBlock
{
    public WallTriangleCutBannerBlock(DyeColor color, Properties properties)
    {
        super(color, properties);
    }

    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn)
    {
        return new TriangleCutBannerTileEntity(getColor());
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world)
    {
        return new TriangleCutBannerTileEntity(getColor());
    }

    @Override
    public boolean hasTileEntity(BlockState state)
    {
        return true;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
    {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        if (tileentity instanceof TriangleCutBannerTileEntity)
        {
            if (stack.hasDisplayName())
            {
                ((TriangleCutBannerTileEntity)tileentity).setName(stack.getDisplayName());
            }
        }
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        TileEntity tileentity = worldIn.getTileEntity(pos);
        return tileentity instanceof TriangleCutBannerTileEntity ? ((TriangleCutBannerTileEntity)tileentity).getItem(state) : super.getItem(worldIn, pos, state);
    }
}
