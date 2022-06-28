package net.pikachyuu.mewcraft.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;

public class ModRegistries {
    public static void registerModStuffs(){
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MEWLING, MewlingEntity.setAttributes());
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.SAKURA_LOG, 5, 20);
        instance.add(ModBlocks.SAKURA_WOOD, 5, 20);
        instance.add(ModBlocks.STRIPPED_SAKURA_LOG, 5, 20);
        instance.add(ModBlocks.STRIPPED_SAKURA_WOOD, 5, 20);
        instance.add(ModBlocks.SAKURA_PLANKS, 5, 20);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.SAKURA_LOG, ModBlocks.STRIPPED_SAKURA_LOG);
        StrippableBlockRegistry.register(ModBlocks.SAKURA_WOOD, ModBlocks.STRIPPED_SAKURA_WOOD);
    }
}
