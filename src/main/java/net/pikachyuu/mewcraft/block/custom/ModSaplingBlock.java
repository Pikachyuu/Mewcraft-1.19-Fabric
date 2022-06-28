package net.pikachyuu.mewcraft.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class ModSaplingBlock extends SaplingBlock {

    /**
     * Access widened by fabric-transitive-access-wideners-v1 to accessible
     *
     * @param generator
     * @param settings
     */
    public ModSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
}
