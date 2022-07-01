package net.pikachyuu.mewcraft.world.gen;
import net.pikachyuu.mewcraft.world.gen.ModOreGeneration;

public class ModWorldGen {
    public static void generateModWorldGen(){
        ModTreeGeneration.generateTrees();
        ModOreGeneration.generateOres();

        ModEntitySpawn.addEntitySpawn();
    }
}
