package net.pikachyuu.mewcraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.pikachyuu.mewcraft.block.ModBlocks;
import net.pikachyuu.mewcraft.item.ModItems;
import net.pikachyuu.mewcraft.item.ModMusicDiscs;
import net.pikachyuu.mewcraft.sound.ModSoundEvents;
import net.pikachyuu.mewcraft.util.ModLootTableModifiers;
import net.pikachyuu.mewcraft.util.ModRegistries;
import net.pikachyuu.mewcraft.world.ModRegion;
import net.pikachyuu.mewcraft.world.ModSurfaceRuleData;
import net.pikachyuu.mewcraft.world.biome.ModBiomes;
//import net.pikachyuu.mewcraft.world.dimension.ModDimensions;
import net.pikachyuu.mewcraft.world.feature.ModConfiguredFeatures;
import net.pikachyuu.mewcraft.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class Mewcraft implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "mewcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSoundEvents.registerModSoundEvents();
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModMusicDiscs.registerCustomMusicDiscs();

		ModRegistries.registerModStuffs();

		ModWorldGen.generateModWorldGen();
		ModBiomes.registerBiomes();

		ModLootTableModifiers.modifyLootTables();

		//ModDimensions.registerModDimensions();
	}


	@Override
	public void onTerraBlenderInitialized()
	{
		// Given we only add two biomes, we should keep our weight relatively low.
		Regions.register(new ModRegion(new Identifier(MOD_ID, "overworld"), 2));

		// Register our surface rules
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModSurfaceRuleData.makeRules());
	}

}
