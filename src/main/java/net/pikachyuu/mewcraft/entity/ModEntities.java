package net.pikachyuu.mewcraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;

public class ModEntities {
    public static final EntityType<MewlingEntity> MEWLING = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Mewcraft.MOD_ID, "mewling"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MewlingEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());
}
