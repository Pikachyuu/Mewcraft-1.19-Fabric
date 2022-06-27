package net.pikachyuu.mewcraft.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;

public class ModRegistries {
    public static void registerModStuffs(){
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MEWLING, MewlingEntity.setAttributes());
    }
}
