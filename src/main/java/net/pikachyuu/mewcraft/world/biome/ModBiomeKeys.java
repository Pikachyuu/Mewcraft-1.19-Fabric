package net.pikachyuu.mewcraft.world.biome;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.pikachyuu.mewcraft.Mewcraft;

public class ModBiomeKeys {
    public static final RegistryKey<Biome> SAKURA_FOREST = register("sakura_forest");
    public static final RegistryKey<Biome> MEW_WORLD_SAKURA_FOREST = register("mew_world_sakura_forest");

    private static RegistryKey<Biome> register(String name)
    {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(Mewcraft.MOD_ID, name));
    }
}
