package net.pikachyuu.mewcraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.pikachyuu.mewcraft.world.biome.ModBiomeKeys;
import net.pikachyuu.mewcraft.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SAKURA_PLACED.getKey().get());
    }
}
