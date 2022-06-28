package net.pikachyuu.mewcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.pikachyuu.mewcraft.Mewcraft;
import net.pikachyuu.mewcraft.block.custom.ModSaplingBlock;
import net.pikachyuu.mewcraft.item.ModItemGroup;
import net.pikachyuu.mewcraft.world.feature.tree.SakuraSaplingGenerator;

public class ModBlocks {

    public static final Block TEST_BLOCK_1 = registerBlock("test_block_1",
            new Block(FabricBlockSettings.of(Material.BARRIER)), ModItemGroup.MEWCRAFT);

    public static final Block TEST_BLOCK_2 = registerBlock("test_block_2",
            new Block(FabricBlockSettings.of(Material.BARRIER)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_BLOCK = registerBlock("sakura_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3).requiresTool()), ModItemGroup.MEWCRAFT);

    public static final Block MEWNITE_BLOCK = registerBlock("mewnite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3).requiresTool()), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_ORE = registerBlock("sakura_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4).requiresTool(),
            UniformIntProvider.create(8, 12)), ModItemGroup.MEWCRAFT);

    public static final Block DEEPSLATE_SAKURA_ORE = registerBlock("deepslate_sakura_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4).requiresTool(),
                    UniformIntProvider.create(8, 12)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_LOG = registerBlock("sakura_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_WOOD = registerBlock("sakura_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ModItemGroup.MEWCRAFT);

    public static final Block STRIPPED_SAKURA_LOG = registerBlock("stripped_sakura_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ModItemGroup.MEWCRAFT);

    public static final Block STRIPPED_SAKURA_WOOD = registerBlock("stripped_sakura_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_PLANKS = registerBlock("sakura_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_LEAVES = registerBlock("sakura_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_SAPLING = registerBlock("sakura_sapling",
            new ModSaplingBlock(new SakuraSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque().strength(1.0f)), ModItemGroup.MEWCRAFT);

    /*
    public static final Block SAKURA_GRASS = registerBlock("sakura_grass",
            new GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).strength(1.0f)), ModItemGroup.MEWCRAFT);
    */

    public static final Block SAKURA_FENCE = registerBlock("sakura_fence",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_GATE = registerBlock("sakura_gate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_PRESSURE_PLATE = registerBlock("sakura_pressure_plate",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_BUTTON = registerBlock("sakura_button",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_STAIRS = registerBlock("sakura_stairs",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.MEWCRAFT);

    public static final Block SAKURA_SLAB = registerBlock("sakura_slab",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.MEWCRAFT);

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
