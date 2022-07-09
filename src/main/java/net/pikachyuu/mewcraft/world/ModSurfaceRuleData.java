package net.pikachyuu.mewcraft.world;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.pikachyuu.mewcraft.world.biome.ModBiomeKeys;

public class ModSurfaceRuleData {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(Blocks.DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule DIAMOND_BLOCK = makeStateRule(Blocks.DIAMOND_BLOCK);
    private static final MaterialRules.MaterialRule STONE = makeStateRule(Blocks.STONE);

    public static MaterialRules.MaterialRule makeRules()
    {
        MaterialRules.MaterialCondition CUSTOM_FLOOR = MaterialRules.aboveYWithStoneDepth(YOffset.fixed(80), 0);
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);
        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIAMOND_BLOCK);


        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block)
    {
        return MaterialRules.block(block.getDefaultState());
    }
}
/*
        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.not(MaterialRules.STONE_DEPTH_FLOOR), STONE),

                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, GRASS_BLOCK));
 */