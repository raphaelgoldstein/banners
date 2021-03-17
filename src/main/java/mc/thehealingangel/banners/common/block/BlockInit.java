package mc.thehealingangel.banners.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "tha_banners");

    public static final RegistryObject<Block> PIXELART_BRICK = BLOCKS.register("pixelart_brick", () -> new Block(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> PIXELART_BRICK_VINES = BLOCKS.register("pixelart_brick_vines", () -> new Block(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> WHITE_TRIANGLE_CUT_BANNER = BLOCKS.register("white_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.WHITE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_TRIANGLE_CUT_BANNER = BLOCKS.register("orange_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.ORANGE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGENTA_TRIANGLE_CUT_BANNER = BLOCKS.register("magenta_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.MAGENTA, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_TRIANGLE_CUT_BANNER = BLOCKS.register("light_blue_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.LIGHT_BLUE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YELLOW_TRIANGLE_CUT_BANNER = BLOCKS.register("yellow_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.YELLOW, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_TRIANGLE_CUT_BANNER = BLOCKS.register("lime_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.LIME, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_TRIANGLE_CUT_BANNER = BLOCKS.register("pink_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.PINK, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRAY_TRIANGLE_CUT_BANNER = BLOCKS.register("gray_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.GRAY, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_TRIANGLE_CUT_BANNER = BLOCKS.register("light_gray_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.LIGHT_GRAY, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_TRIANGLE_CUT_BANNER = BLOCKS.register("cyan_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.CYAN, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_TRIANGLE_CUT_BANNER = BLOCKS.register("purple_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.PURPLE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_TRIANGLE_CUT_BANNER = BLOCKS.register("blue_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.BLUE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BROWN_TRIANGLE_CUT_BANNER = BLOCKS.register("brown_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.BROWN, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_TRIANGLE_CUT_BANNER = BLOCKS.register("green_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.GREEN, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_TRIANGLE_CUT_BANNER = BLOCKS.register("red_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.RED, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLACK_TRIANGLE_CUT_BANNER = BLOCKS.register("black_triangle_cut_banner", () -> new TriangleCutBannerBlock(DyeColor.BLACK, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> WHITE_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("white_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.WHITE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(WHITE_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> ORANGE_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("orange_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.ORANGE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(ORANGE_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> MAGENTA_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("magenta_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.MAGENTA, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(MAGENTA_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("light_blue_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.LIGHT_BLUE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(LIGHT_BLUE_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> YELLOW_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("yellow_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.YELLOW, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(YELLOW_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> LIME_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("lime_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.LIME, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(LIME_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> PINK_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("pink_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.PINK, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(PINK_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> GRAY_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("gray_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.GRAY, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(GRAY_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("light_gray_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.LIGHT_GRAY, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(LIGHT_GRAY_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> CYAN_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("cyan_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.CYAN, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(CYAN_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> PURPLE_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("purple_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.PURPLE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(PURPLE_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> BLUE_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("blue_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.BLUE, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(BLUE_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> BROWN_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("brown_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.BROWN, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(BROWN_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> GREEN_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("green_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.GREEN, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(GREEN_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> RED_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("red_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.RED, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(RED_TRIANGLE_CUT_BANNER.get())));
    public static final RegistryObject<Block> BLACK_WALL_TRIANGLE_CUT_BANNER = BLOCKS.register("black_wall_triangle_cut_banner", () -> new WallTriangleCutBannerBlock(DyeColor.BLACK, Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(1.0F).sound(SoundType.WOOD).lootFrom(BLACK_TRIANGLE_CUT_BANNER.get())));
}