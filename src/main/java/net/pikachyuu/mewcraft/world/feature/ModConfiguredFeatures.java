package net.pikachyuu.mewcraft.world.feature;

import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static void registerConfiguredFeatures() {

        System.out.println("Registering ModConfiguredFeatures for " + Mewcraft.MOD_ID);
    }
}
