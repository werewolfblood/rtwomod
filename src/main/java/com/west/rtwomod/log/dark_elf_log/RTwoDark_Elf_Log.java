package com.west.rtwomod.log.dark_elf_log;

import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoDark_Elf_Log {

    public static final Block DARK_ELF_LOG = registerBlock("dark_elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(7f)));
    public static final Block STRIPPED_DARK_ELF_LOG= registerBlock("stripped_dark_elf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(6f)));
    public static final Block DARK_ELF_LOG1 = registerBlock("dark_elf_log1",
            new PillarBlock(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DARK_ELF_LOG2 = registerBlock("dark_elf_log2",
            new PillarBlock(AbstractBlock.Settings.create().strength(6f)));
    public static final Block DARK_ELF_LOG3 = registerBlock("dark_elf_log3",
            new PillarBlock(AbstractBlock.Settings.create().strength(6f)));
    public static final Block DARK_ELF_LOG4 = registerBlock("dark_elf_log4",
            new PillarBlock(AbstractBlock.Settings.create().strength(6f)));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RTwomod.MOD_ID, name), block);
    }
    public static void    registerBlockItem(String name, Block block ) {
        Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RTwomod.LOGGER.info("Registering Mod Blocks for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}
