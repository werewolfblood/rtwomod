package com.west.rtwomod;

import com.west.rtwomod.item.RTwoItem;
import com.west.rtwomod.item.RTwoItemGroups;
import com.west.rtwomod.log.RTwoLog;
import com.west.rtwomod.log.dark_elf_log.RTwoDark_Elf_Log;
import com.west.rtwomod.log.dwarf_log.RTwoDwarf_log;
import com.west.rtwomod.log.silver_log.RTwoSilver_log;
import com.west.rtwomod.log.skaven_log.RTwoSkaven_log;
import com.west.rtwomod.log.sunelf_log.RTwoSunElf_log;
import com.west.rtwomod.rock.RTwoRock;
import com.west.rtwomod.stone.RTwoStone;
import com.west.rtwomod.stone.brick.RTwoBrick;
import com.west.rtwomod.stone.brick.chaos_brick.RTwoChaos_Block;
import com.west.rtwomod.stone.brick.drow_brick.RTwoDrowBrick;
import com.west.rtwomod.stone.dwarf_stone.RTwoDwarfStone;
import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RTwomod implements ModInitializer {
	public static final String MOD_ID = "rtwomod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		RTwoLog.registerModBlocks();
		RTwoDark_Elf_Log.registerModBlocks();
		RTwoDwarf_log.registerModBlocks();
		RTwoSilver_log.registerModBlocks();
		RTwoSkaven_log.registerModBlocks();
		RTwoSunElf_log.registerModBlocks();
		RTwoStone.registerModBlocks();
		RTwoBrick.registerModBlocks();
		RTwoDrowBrick.registerModBlocks();
		RTwoChaos_Block.registerModBlocks();
		RTwoDwarfStone.registerModBlocks();
		RTwoRock.registerModBlocks();
		RTwoItemGroups.registerItemGroups();
		RTwoItem.registerModItems();

		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		LOGGER.info("Hello Fabric world!");
		CompostingChanceRegistry.INSTANCE.add(RTwoDwarf_log.DWARF_BRANCH1, 0.5f);
		CompostingChanceRegistry.INSTANCE.add(RTwoDwarf_log.BEAM, 0.5f);
	}
}