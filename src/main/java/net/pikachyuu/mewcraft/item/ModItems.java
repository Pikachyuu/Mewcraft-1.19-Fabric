package net.pikachyuu.mewcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.pikachyuu.mewcraft.entity.ModEntities;
import net.pikachyuu.mewcraft.entity.custom.MewlingEntity;
import net.pikachyuu.mewcraft.item.custom.*;
import net.pikachyuu.mewcraft.util.CustomBoatType;

public class ModItems {

    public static final Item CRYSTALLINE_SAKURA = registerItem("crystalline_sakura",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_CRYSTAL = registerItem("sakura_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_INGOT = registerItem("sakura_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWNITE_INGOT = registerItem("mewnite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWLING_TAIL = registerItem("mewling_tail",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_HELMET = registerItem("sakura_helmet",
            new ArmorItem(ModArmorMaterials.SAKURA, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_CHESTPLATE = registerItem("sakura_chestplate",
            new ArmorItem(ModArmorMaterials.SAKURA, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_LEGGINGS = registerItem("sakura_leggings",
            new ArmorItem(ModArmorMaterials.SAKURA, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_BOOTS = registerItem("sakura_boots",
            new ArmorItem(ModArmorMaterials.SAKURA, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_SWORD = registerItem("sakura_sword",
            new SwordItem(ModToolMaterials.SAKURA, 3, -2.4F,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_PICKAXE = registerItem("sakura_pickaxe",
            new ModPickaxeItem(ModToolMaterials.SAKURA, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_AXE = registerItem("sakura_axe",
            new ModAxeItem(ModToolMaterials.SAKURA, 6, -3.1F,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_SHOVEL = registerItem("sakura_shovel",
            new ShovelItem(ModToolMaterials.SAKURA, 1, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_HOE = registerItem("sakura_hoe",
            new ModHoeItem(ModToolMaterials.SAKURA, 0, -2.8F,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWLING_SPAWN_EGG = registerItem("mewling_spawn_egg",
            new SpawnEggItem(ModEntities.MEWLING, 16768255, 14044277,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_SIGN = registerItem("sakura_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.MEWCRAFT).maxCount(16),
                    ModBlocks.SAKURA_SIGN_BLOCK, ModBlocks.SAKURA_WALL_SIGN_BLOCK));

    public static final Item MEWNITE_HELMET = registerItem("mewnite_helmet",
            new MewniteArmorItem(ModArmorMaterials.MEWNITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWNITE_CHESTPLATE = registerItem("mewnite_chestplate",
            new MewniteArmorItem(ModArmorMaterials.MEWNITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWNITE_LEGGINGS = registerItem("mewnite_leggings",
            new MewniteArmorItem(ModArmorMaterials.MEWNITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWNITE_BOOTS = registerItem("mewnite_boots",
            new MewniteArmorItem(ModArmorMaterials.MEWNITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_IGNITER = registerItem("sakura_igniter",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWNITE_KATANA = registerItem("mewnite_katana",
            new MewniteKatanaItem(ModToolMaterials.MEWNITE, 2, -2.0F,
                    new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mewcraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mewcraft.LOGGER.debug("Register Mod Items for " + Mewcraft.MOD_ID);
    }
}
