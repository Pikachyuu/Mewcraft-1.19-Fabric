package net.pikachyuu.mewcraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_SAKURA_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SAKURA_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_SAKURA_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAKURA_ORE =
            ConfiguredFeatures.register("sakura_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SAKURA_ORES, 3));

    public static void registerConfiguredFeatures() {

        System.out.println("Registering ModConfiguredFeatures for " + Mewcraft.MOD_ID);
    }
}


