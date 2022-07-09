package net.pikachyuu.mewcraft.world.dimension;

import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.pikachyuu.mewcraft.item.ModItems;


public class ModDimensions {
    public static final RegistryKey<World> MEW_WORLD_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(Mewcraft.MOD_ID, "mew_world"));
    public static final RegistryKey<DimensionType> MEW_WORLD_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            MEW_WORLD_DIMENSION_KEY.getValue());

    public static final RegistryKey<DimensionOptions> MEW_WORLD = RegistryKey.of(Registry.DIMENSION_KEY, new Identifier("mew_world"));


    public static void registerModDimensions() {
        Mewcraft.LOGGER.debug("Registering Mod Dimensions for " + Mewcraft.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.SAKURA_CRYSTAL_BLOCK)
                .destDimID(MEW_WORLD_DIMENSION_KEY.getValue())
                .tintColor(233, 177, 205)
                .lightWithItem(ModItems.SAKURA_IGNITER)
                .registerPortal();
    }
}


