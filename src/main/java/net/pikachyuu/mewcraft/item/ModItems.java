package net.pikachyuu.mewcraft.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mewcraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mewcraft.LOGGER.debug("Register Mod Items for " + Mewcraft.MOD_ID);
    }
}
