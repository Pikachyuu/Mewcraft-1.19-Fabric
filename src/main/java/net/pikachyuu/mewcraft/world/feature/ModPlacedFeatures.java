package net.pikachyuu.mewcraft.world.feature;

import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> SAKURA_ORE_PLACED = PlacedFeatures.register("sakura_ore_placed",
            ModConfiguredFeatures.SAKURA_ORE, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(32))));

    //Mess with these values
    public static final RegistryEntry<PlacedFeature> SAKURA_PLACED = PlacedFeatures.register("sakura_placed",
            ModConfiguredFeatures.SAKURA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

}
