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
//First allow me to profusely apologize for the DM, as it is not standard to DM a server owner. (I will also take this moment to apologize for my formal speech, as I know it can get annoying and suffocating) As of this moment, I am currently working on a project for the Mewcraft server. It was originally meant to be a complete surprise, but as you have now made an announcement of updating the mewcraft server (at an undisclosed point in time) I am worried my project may not be done in time. Of course, you have zero obligation to listen to some random person you've never conversed with, but I would like to make a request for you to postpone the updating of the server by 2 days. I personally, would like to keep the nature of the project a secret in order to make it a surprise, but since I am the one making the request, it would be wrong of me to withhold information from you if you wish to know. Thank you for taking the time to read this. I apologize for brashness the request.
//Hi there! I apologize for the DM as I know you normally do not message a server owner. I had something I would like to discuss with you directly, henceforth the form of communication. I'd like to talk to you about something regarding your mewcraft server, is that alright with you? (Allow me to also apologize for the formal speech. I know it can come off as quite suffocating and annoying. In my personal opinion, it does not feel right to write to someone for the first time in an informal manner whilst making a request.)
