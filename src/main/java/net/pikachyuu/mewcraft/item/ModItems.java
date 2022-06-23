package net.pikachyuu.mewcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;

public class ModItems {

    public static final Item RAW_SAKURA = registerItem("raw_sakura",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item SAKURA_INGOT = registerItem("sakura_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWNITE_INGOT = registerItem("mewnite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));

    public static final Item MEWLINGS_TAIL = registerItem("mewlings_tail",
            new Item(new FabricItemSettings().group(ModItemGroup.MEWCRAFT)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mewcraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mewcraft.LOGGER.debug("Register Mod Items for " + Mewcraft.MOD_ID);
    }
}
