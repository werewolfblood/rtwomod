package com.west.rtwomod.log;

import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoLog {
    public static final Block BLUEGLOW_LOG= registerBlock("blueglow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(8f)));
    public static final Block STRIPPED_BLUEGLOW_LOG= registerBlock("stripped_blueglow_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(8f)));
    public static final Block REDWOOD_PLANKS= registerBlock("redwood_planks",
            new Cobble(AbstractBlock.Settings.create().strength(8f)));
    public static final Block WALNUT_PLANKS= registerBlock("walnut_planks",
            new Cobble(AbstractBlock.Settings.create().strength(8f)));
    public static final Block WALNUT_SLAB= registerBlock("walnut_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(8f)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RTwomod.MOD_ID, name), block);
    }
    public static  void  registerBlockItem(String name, Block block ) {
        Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RTwomod.LOGGER.info("Registering Mod Blocks for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}