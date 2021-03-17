package mc.thehealingangel.banners.common.tileentity;

import mc.thehealingangel.banners.common.block.BlockInit;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit
{
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, "tha_banners");

    public static final RegistryObject<TileEntityType<TriangleCutBannerTileEntity>> TRIANGLE_CUT_BANNER = TILE_ENTITY_TYPES
            .register("triangle_cut_banner", () -> TileEntityType.Builder.create(TriangleCutBannerTileEntity::new,
                    BlockInit.WHITE_TRIANGLE_CUT_BANNER.get(), BlockInit.WHITE_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.ORANGE_TRIANGLE_CUT_BANNER.get(), BlockInit.ORANGE_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.MAGENTA_TRIANGLE_CUT_BANNER.get(), BlockInit.MAGENTA_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.LIGHT_BLUE_TRIANGLE_CUT_BANNER.get(), BlockInit.LIGHT_BLUE_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.YELLOW_TRIANGLE_CUT_BANNER.get(), BlockInit.YELLOW_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.LIME_TRIANGLE_CUT_BANNER.get(), BlockInit.LIME_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.PINK_TRIANGLE_CUT_BANNER.get(), BlockInit.PINK_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.GRAY_TRIANGLE_CUT_BANNER.get(), BlockInit.GRAY_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.LIGHT_GRAY_TRIANGLE_CUT_BANNER.get(), BlockInit.LIGHT_GRAY_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.CYAN_TRIANGLE_CUT_BANNER.get(), BlockInit.CYAN_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.PURPLE_TRIANGLE_CUT_BANNER.get(), BlockInit.PURPLE_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.BLUE_TRIANGLE_CUT_BANNER.get(), BlockInit.BLUE_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.BROWN_TRIANGLE_CUT_BANNER.get(), BlockInit.BROWN_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.GREEN_TRIANGLE_CUT_BANNER.get(), BlockInit.GREEN_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.RED_TRIANGLE_CUT_BANNER.get(), BlockInit.RED_WALL_TRIANGLE_CUT_BANNER.get(),
                    BlockInit.BLACK_TRIANGLE_CUT_BANNER.get(), BlockInit.BLACK_WALL_TRIANGLE_CUT_BANNER.get()
            ).build(null));
}
