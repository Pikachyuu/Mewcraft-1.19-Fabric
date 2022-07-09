package net.pikachyuu.mewcraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.pikachyuu.mewcraft.world.biome.ModBiomeKeys;
import net.pikachyuu.mewcraft.world.biome.ModBiomeSelectors;
import net.pikachyuu.mewcraft.world.feature.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SAKURA_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.MEW_WORLD_SAKURA_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MEW_WORLD_SAKURA_ORE_PLACED.getKey().get());
    }
}
