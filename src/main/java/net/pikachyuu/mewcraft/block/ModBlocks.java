package net.pikachyuu.mewcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.item.ModItemGroup;

public class ModBlocks {

    public static final Block MEWNITE_BLOCK = registerBlock("mewnite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4).requiresTool()), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_ORE = registerBlock("sakura_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4).requiresTool(),
            UniformIntProvider.create(8, 12)), ModItemGroup.MEWCRAFT);

    public static final Block DEEPSLATE_SAKURA_ORE = registerBlock("deepslate_sakura_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4).requiresTool(),
                    UniformIntProvider.create(8, 12)), ModItemGroup.MEWCRAFT);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Mewcraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Mewcraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Mewcraft.LOGGER.debug("Registering ModBlocks for " + Mewcraft.MOD_ID);
    }
}