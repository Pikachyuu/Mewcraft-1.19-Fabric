package net.pikachyuu.mewcraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.Mewcraft;

public class ModItemGroup {
    public static final ItemGroup MEWCRAFT = FabricItemGroupBuilder.build(new Identifier(Mewcraft.MOD_ID, "mewcraft"),
            () -> new ItemStack(ModItems.MEWLING_TAIL));
}
