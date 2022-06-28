package net.pikachyuu.mewcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.entity.client.MewlingRenderer;

public class MewcraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MEWLING, MewlingRenderer::new);
    }
}
