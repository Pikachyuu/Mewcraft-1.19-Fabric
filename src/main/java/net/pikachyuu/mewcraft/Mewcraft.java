package net.pikachyuu.mewcraft;

import net.fabricmc.api.ModInitializer;
import net.pikachyuu.mewcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mewcraft implements ModInitializer {
	public static final String MOD_ID = "mewcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
