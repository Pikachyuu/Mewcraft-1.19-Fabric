package net.pikachyuu.mewcraft.world.feature;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.block.ModBlocks;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {

    //Screw with these values
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SAKURA_TREE =
            ConfiguredFeatures.register("sakura_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.SAKURA_LOG),
                    new LargeOakTrunkPlacer(6, 12, 3),
                    BlockStateProvider.of(ModBlocks.SAKURA_LEAVES),
                    new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).build());

    public static final RegistryEntry<PlacedFeature> SAKURA_CHECKED =
            PlacedFeatures.register("sakura_checked", ModConfiguredFeatures.SAKURA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.SAKURA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> SAKURA_SPAWN =
            ConfiguredFeatures.register("sakura_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(SAKURA_CHECKED, 0.5f)),
                            SAKURA_CHECKED));

    public static final List<OreFeatureConfig.Target> OVERWORLD_SAKURA_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SAKURA_ORE.getDefaultState()),

            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_SAKURA_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAKURA_ORE =
            ConfiguredFeatures.register("sakura_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_SAKURA_ORES, 3));

    //Shitty hotfix I'm doing for mew world for the time being. Have fun future me.

    public static final List<OreFeatureConfig.Target> MEW_WORLD_SAKURA_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.SAKURA_ORE.getDefaultState()),

            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_SAKURA_ORE.getDefaultState()));


    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MEW_WORLD_SAKURA_ORE =
            ConfiguredFeatures.register("mew_world_sakura_ore", Feature.ORE,
                    new OreFeatureConfig(MEW_WORLD_SAKURA_ORES, 6));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Mewcraft.MOD_ID);
    }
}


