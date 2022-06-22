package net.pikachyuu.mewcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;

public class ModItems {

    public static final Item SAKURA_INGOT = registerItem("sakura_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MEW_INGOT = registerItem("mew_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MEWLINGS_TAIL = registerItem("mewlings_tail",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mewcraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Mewcraft.LOGGER.debug("Register Mod Items for " + Mewcraft.MOD_ID);
    }
}
