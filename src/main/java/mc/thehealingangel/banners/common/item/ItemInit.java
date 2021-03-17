package mc.thehealingangel.banners.common.item;

import mc.thehealingangel.banners.common.block.BlockInit;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "tha_banners");

    public static final RegistryObject<Item> PIXELART_BRICK = ITEMS.register("pixelart_brick", () -> new BlockItem(BlockInit.PIXELART_BRICK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PIXELART_BRICK_VINES = ITEMS.register("pixelart_brick_vines", () -> new BlockItem(BlockInit.PIXELART_BRICK_VINES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEMP_EGG = ITEMS.register("temp_egg", () -> new SpawnEggItem(EntityType.IRON_GOLEM, 0xFF0000, 0x00FF00, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_TRIANGLE_CUT_BANNER = ITEMS.register("white_triangle_cut_banner", () -> new BannerItem(BlockInit.WHITE_TRIANGLE_CUT_BANNER.get(), BlockInit.WHITE_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> ORANGE_TRIANGLE_CUT_BANNER = ITEMS.register("orange_triangle_cut_banner", () -> new BannerItem(BlockInit.ORANGE_TRIANGLE_CUT_BANNER.get(), BlockInit.ORANGE_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> MAGENTA_TRIANGLE_CUT_BANNER = ITEMS.register("magenta_triangle_cut_banner", () -> new BannerItem(BlockInit.MAGENTA_TRIANGLE_CUT_BANNER.get(), BlockInit.MAGENTA_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_BLUE_TRIANGLE_CUT_BANNER = ITEMS.register("light_blue_triangle_cut_banner", () -> new BannerItem(BlockInit.LIGHT_BLUE_TRIANGLE_CUT_BANNER.get(), BlockInit.LIGHT_BLUE_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> YELLOW_TRIANGLE_CUT_BANNER = ITEMS.register("yellow_triangle_cut_banner", () -> new BannerItem(BlockInit.YELLOW_TRIANGLE_CUT_BANNER.get(), BlockInit.YELLOW_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> LIME_TRIANGLE_CUT_BANNER = ITEMS.register("lime_triangle_cut_banner", () -> new BannerItem(BlockInit.LIME_TRIANGLE_CUT_BANNER.get(), BlockInit.LIME_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> PINK_TRIANGLE_CUT_BANNER = ITEMS.register("pink_triangle_cut_banner", () -> new BannerItem(BlockInit.PINK_TRIANGLE_CUT_BANNER.get(), BlockInit.PINK_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GRAY_TRIANGLE_CUT_BANNER = ITEMS.register("gray_triangle_cut_banner", () -> new BannerItem(BlockInit.GRAY_TRIANGLE_CUT_BANNER.get(), BlockInit.GRAY_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> LIGHT_GRAY_TRIANGLE_CUT_BANNER = ITEMS.register("light_gray_triangle_cut_banner", () -> new BannerItem(BlockInit.LIGHT_GRAY_TRIANGLE_CUT_BANNER.get(), BlockInit.LIGHT_GRAY_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> CYAN_TRIANGLE_CUT_BANNER = ITEMS.register("cyan_triangle_cut_banner", () -> new BannerItem(BlockInit.CYAN_TRIANGLE_CUT_BANNER.get(), BlockInit.CYAN_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> PURPLE_TRIANGLE_CUT_BANNER = ITEMS.register("purple_triangle_cut_banner", () -> new BannerItem(BlockInit.PURPLE_TRIANGLE_CUT_BANNER.get(), BlockInit.PURPLE_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> BLUE_TRIANGLE_CUT_BANNER = ITEMS.register("blue_triangle_cut_banner", () -> new BannerItem(BlockInit.BLUE_TRIANGLE_CUT_BANNER.get(), BlockInit.BLUE_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> BROWN_TRIANGLE_CUT_BANNER = ITEMS.register("brown_triangle_cut_banner", () -> new BannerItem(BlockInit.BROWN_TRIANGLE_CUT_BANNER.get(), BlockInit.BROWN_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GREEN_TRIANGLE_CUT_BANNER = ITEMS.register("green_triangle_cut_banner", () -> new BannerItem(BlockInit.GREEN_TRIANGLE_CUT_BANNER.get(), BlockInit.GREEN_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> RED_TRIANGLE_CUT_BANNER = ITEMS.register("red_triangle_cut_banner", () -> new BannerItem(BlockInit.RED_TRIANGLE_CUT_BANNER.get(), BlockInit.RED_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> BLACK_TRIANGLE_CUT_BANNER = ITEMS.register("black_triangle_cut_banner", () -> new BannerItem(BlockInit.BLACK_TRIANGLE_CUT_BANNER.get(), BlockInit.BLACK_WALL_TRIANGLE_CUT_BANNER.get(), new Item.Properties().maxStackSize(16).group(ItemGroup.DECORATIONS)));

}
