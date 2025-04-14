package com.west.rtwomod;

import com.west.rtwomod.fantasy.RTwoFantasy;
import com.west.rtwomod.item.RTwoItem;
import com.west.rtwomod.item.RTwoItemGroups;
import com.west.rtwomod.log.RTwoLog;
import com.west.rtwomod.men.RTwoMen;
import com.west.rtwomod.stone.RTwoStone;
import com.west.rtwomod.stone.cobblestone.andesite.RTwoAndesite;
import com.west.rtwomod.stone.cobblestone.limestone.RTwoLimestone;
import net.fabricmc.api.ModInitializer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RTwomod implements ModInitializer {
	public static final String MOD_ID = "rtwomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		RTwoLog.registerModBlocks();
		RTwoMen.registerModBlocks();
		RTwoFantasy.registerModBlocks();
		RTwoStone.registerModBlocks();
		RTwoAndesite.registerModBlocks();
		RTwoLimestone.registerModBlocks();
		RTwoItemGroups.registerItemGroups();
		RTwoItem.registerModItems();
	


		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		LOGGER.info("Hello Fabric world!");




	}
}