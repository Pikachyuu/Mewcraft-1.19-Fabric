package net.pikachyuu.mewcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.entity.client.MewlingRenderer;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;
import net.pikachyuu.mewcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MewcraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MEWLING, MewlingRenderer::new);
    }
}
