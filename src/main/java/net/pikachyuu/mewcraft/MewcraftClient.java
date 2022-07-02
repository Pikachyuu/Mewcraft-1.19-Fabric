package net.pikachyuu.mewcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.entity.client.Armor.MewniteArmorRenderer;
import net.pikachyuu.mewcraft.entity.client.MewlingRenderer;
import net.pikachyuu.mewcraft.item.ModItems;
import net.pikachyuu.mewcraft.item.client.MewniteBattleAxeRenderer;
import net.pikachyuu.mewcraft.item.client.MewniteKatanaRenderer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MewcraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MEWLING, MewlingRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAKURA_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAKURA_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAKURA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAKURA_LEAVES, RenderLayer.getCutout());

        GeoArmorRenderer.registerArmorRenderer(new MewniteArmorRenderer(), ModItems.MEWNITE_BOOTS,
                ModItems.MEWNITE_LEGGINGS, ModItems.MEWNITE_CHESTPLATE, ModItems.MEWNITE_HELMET);

        GeoItemRenderer.registerItemRenderer(ModItems.MEWNITE_KATANA, new MewniteKatanaRenderer());
        GeoItemRenderer.registerItemRenderer(ModItems.MEWNITE_BATTLEAXE, new MewniteBattleAxeRenderer());
    }
}
