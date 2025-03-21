package com.west.rtwomod.log.dwarf_log;

import com.west.rtwomod.BranchBlock;
import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import com.west.rtwomod.WoodBeamBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoDwarf_log {



    public static final Block DWARF_LOG= registerBlock("dwarf_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(8f)));
    public static final Block DWARF_PLANKS = registerBlock("dwarf_planks",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_PLANKS_WALL = registerBlock("dwarf_planks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_PLANKS1 = registerBlock("dwarf_planks1",
            new Cobble(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_BRANCH1= registerBlock("dwarf_branch1",
            new BranchBlock(AbstractBlock.Settings.create().strength(8f)));
    public static final Block BEAM =registerBlock("beam",
            new WoodBeamBlock(AbstractBlock.Settings.create().strength(8f).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RTwomod.MOD_ID, name), block);
    }
    public static void  registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RTwomod.LOGGER.info("Registering Mod Blocks for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}

