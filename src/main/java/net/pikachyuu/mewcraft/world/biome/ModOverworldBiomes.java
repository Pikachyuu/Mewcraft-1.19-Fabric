package net.pikachyuu.mewcraft.world.biome;

import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicSound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import javax.annotation.Nullable;

public class ModOverworldBiomes {
    @Nullable
    private static final MusicSound NORMAL_MUSIC = null;

    protected static int calculateSkyColor(float color)
    {
        float $$1 = color / 3.0F;
        $$1 = MathHelper.clamp($$1, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

    private static Biome biome(Biome.Precipitation precipitation, int waterColor, int waterFogColor, float temperature, float downfall, SpawnSettings.Builder spawnBuilder, GenerationSettings.Builder biomeBuilder, MusicSound normalMusic) {
        return (new Biome.Builder()).precipitation(precipitation).temperature(temperature).downfall(downfall).effects((new BiomeEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(calculateSkyColor(temperature)).moodSound(BiomeMoodSound.CAVE).music(normalMusic).build()).spawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }

    private static void globalOverworldGeneration(GenerationSettings.Builder builder)
    {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
    }

    public static Biome sakuraForest() {
            SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
            DefaultBiomeFeatures.addPlainsMobs(spawnBuilder);

            GenerationSettings.Builder biomeBuilder = new GenerationSettings.Builder();
            globalOverworldGeneration(biomeBuilder);
            DefaultBiomeFeatures.addDefaultOres(biomeBuilder);
            DefaultBiomeFeatures.addDefaultDisks(biomeBuilder);
            DefaultBiomeFeatures.addDefaultFlowers(biomeBuilder);
            DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);
            DefaultBiomeFeatures.addDesertVegetation(biomeBuilder);
            DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
            DefaultBiomeFeatures.addDesertVegetation(biomeBuilder);
            DefaultBiomeFeatures.addDesertFeatures(biomeBuilder);
            return biome(Biome.Precipitation.RAIN, 4159204, 329011, 2.0F, 0.0F, spawnBuilder, biomeBuilder, NORMAL_MUSIC);
    }
}