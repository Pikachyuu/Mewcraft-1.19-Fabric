package net.pikachyuu.mewcraft;

import net.fabricmc.api.ModInitializer;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.pikachyuu.mewcraft.item.ModItems;
import net.pikachyuu.mewcraft.util.ModRegistries;
import net.pikachyuu.mewcraft.world.feature.ModConfiguredFeatures;
import net.pikachyuu.mewcraft.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mewcraft implements ModInitializer {
	public static final String MOD_ID = "mewcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();
	}

}
