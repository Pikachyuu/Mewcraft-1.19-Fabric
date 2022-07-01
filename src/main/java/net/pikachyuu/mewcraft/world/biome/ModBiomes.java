package net.pikachyuu.mewcraft.world.biome;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static void registerBiomes()
    {
        register(ModBiomeKeys.SAKURA_FOREST, ModOverworldBiomes.sakuraForest());
        register(ModBiomeKeys.MEW_WORLD_SAKURA_FOREST, ModOverworldBiomes.sakuraForest());
    }


    private static void register(RegistryKey<Biome> key, Biome biome)
    {
        BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}