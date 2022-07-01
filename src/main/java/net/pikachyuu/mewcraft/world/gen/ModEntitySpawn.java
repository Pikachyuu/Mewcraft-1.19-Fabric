package net.pikachyuu.mewcraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.world.biome.ModBiomeKeys;

import java.util.Arrays;

public class ModEntitySpawn {
    public static void addEntitySpawn() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(ModBiomeKeys.SAKURA_FOREST),
                SpawnGroup.CREATURE, ModEntities.MEWLING, 25, 2, 4);

        SpawnRestrictionAccessor.callRegister(ModEntities.MEWLING, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }

}
