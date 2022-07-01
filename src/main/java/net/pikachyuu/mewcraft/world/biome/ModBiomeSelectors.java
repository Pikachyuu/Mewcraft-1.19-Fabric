package net.pikachyuu.mewcraft.world.biome;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.minecraft.world.dimension.DimensionOptions;
import net.pikachyuu.mewcraft.world.dimension.ModDimensions;

import java.util.function.Predicate;

public class ModBiomeSelectors {
    public static Predicate<BiomeSelectionContext> foundInMewWorld() {
        return context -> context.canGenerateIn(ModDimensions.MEW_WORLD);
    }
}

