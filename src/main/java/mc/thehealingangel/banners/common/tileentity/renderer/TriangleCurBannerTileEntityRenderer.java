package mc.thehealingangel.banners.common.tileentity.renderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.datafixers.util.Pair;
import mc.thehealingangel.banners.common.tileentity.TriangleCutBannerTileEntity;
import net.minecraft.block.BannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBannerBlock;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.DyeColor;
import net.minecraft.tileentity.BannerPattern;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class TriangleCurBannerTileEntityRenderer extends TileEntityRenderer<TriangleCutBannerTileEntity>
{
    public static final ResourceLocation BANNER_TEXTURE = new ResourceLocation("tha_banners:entity/triangle_cut_banner_base");

    public ModelRenderer poleHead;
    public ModelRenderer pole;
    public ModelRenderer bannerParts;

    public TriangleCurBannerTileEntityRenderer(TileEntityRendererDispatcher dispatcher)
    {
        super(dispatcher);
        this.bannerParts = new ModelRenderer(64, 64, 0, 0);
        this.bannerParts.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bannerParts.addBox(-10.0F, 0.0F, -2.0F, 20.0F, 31.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(1, 32).addBox(-9.0F, 31.0F, -2.0F, 18.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(2, 34).addBox(-8.0F, 32.0F, -2.0F, 16.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(3, 36).addBox(-7.0F, 33.0F, -2.0F, 14.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(4, 38).addBox(-6.0F, 34.0F, -2.0F, 12.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(5, 40).addBox(-5.0F, 35.0F, -2.0F, 10.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(6, 42).addBox(-4.0F, 36.0F, -2.0F, 8.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(7, 44).addBox(-3.0F, 37.0F, -2.0F, 6.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(8, 46).addBox(-2.0F, 38.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.bannerParts.setTextureOffset(9, 48).addBox(-1.0F, 39.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.poleHead = new ModelRenderer(64, 64, 0, 60);
        this.poleHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.poleHead.addBox(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.pole = new ModelRenderer(64, 64, 44, 0);
        this.pole.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pole.addBox(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F, 0.0F, 0.0F, 0.0F);
    }

    public void render(TriangleCutBannerTileEntity tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn)
    {
        List<Pair<BannerPattern, DyeColor>> list = tileEntityIn.getPatternList();
        if (list != null)
        {
            boolean flag = tileEntityIn.getWorld() == null;
            matrixStackIn.push();
            long i;
            if (flag)
            {
                i = 0L;
                matrixStackIn.translate(0.5D, 0.5D, 0.5D);
                pole.showModel = true;
            }
            else
            {
                i = tileEntityIn.getWorld().getGameTime();
                BlockState blockstate = tileEntityIn.getBlockState();
                if (blockstate.getBlock() instanceof BannerBlock)
                {
                    matrixStackIn.translate(0.5D, 0.5D, 0.5D);
                    float f1 = (float)(-blockstate.get(BannerBlock.ROTATION) * 360) / 16.0F;
                    matrixStackIn.rotate(Vector3f.YP.rotationDegrees(f1));
                    pole.showModel = true;
                }
                else
                {
                    matrixStackIn.translate(0.5D, -0.16666667D, 0.5D);
                    float f3 = -blockstate.get(WallBannerBlock.HORIZONTAL_FACING).getHorizontalAngle();
                    matrixStackIn.rotate(Vector3f.YP.rotationDegrees(f3));
                    matrixStackIn.translate(0.0D, -0.3125D, -0.4375D);
                    pole.showModel = false;
                }
            }

            matrixStackIn.push();
            matrixStackIn.scale(0.6666667F, -0.6666667F, -0.6666667F);

            Material material = new Material(AtlasTexture.LOCATION_BLOCKS_TEXTURE, BANNER_TEXTURE);
            IVertexBuilder ivertexbuilder = material.getBuffer(bufferIn, RenderType::getEntitySolid);

            pole.render(matrixStackIn, ivertexbuilder, combinedLightIn, combinedOverlayIn);
            poleHead.render(matrixStackIn, ivertexbuilder, combinedLightIn, combinedOverlayIn);

            BlockPos blockpos = tileEntityIn.getPos();
            float f2 = ((float)Math.floorMod(blockpos.getX() * 7L + blockpos.getY() * 9L + blockpos.getZ() * 13L + i, 100L) + partialTicks) / 100.0F;
            bannerParts.rotateAngleX = (-0.0125F + 0.01F * MathHelper.cos(((float)Math.PI * 2F) * f2)) * (float)Math.PI;
            bannerParts.rotationPointY = -32.0F;
            renderBanner(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, bannerParts, material, true, list);

            matrixStackIn.pop();
            matrixStackIn.pop();
        }
    }

    public static void renderBanner(MatrixStack stack, IRenderTypeBuffer buffer, int packedLightIn, int packedOverlayIn, ModelRenderer renderer, Material materialIn, boolean flag, List<Pair<BannerPattern, DyeColor>> list)
    {
        renderer.render(stack, materialIn.getBuffer(buffer, RenderType::getEntitySolid), packedLightIn, packedOverlayIn);
        for(int i = 0; i < 17 && i < list.size(); ++i)
        {
            Pair<BannerPattern, DyeColor> pair = list.get(i);
            ResourceLocation pattern = new ResourceLocation("tha_banners", pair.getFirst().func_226957_a_(true).getPath().replaceFirst("banner","triangle_cut_banner"));
            float[] rgba = pair.getSecond().getColorComponentValues();
            Material material = new Material(flag ? Atlases.BANNER_ATLAS : Atlases.SHIELD_ATLAS, pattern);
            renderer.render(stack, material.getBuffer(buffer, RenderType::getEntityNoOutline), packedLightIn, packedOverlayIn, rgba[0], rgba[1], rgba[2], 1.0F);
        }
    }
}
