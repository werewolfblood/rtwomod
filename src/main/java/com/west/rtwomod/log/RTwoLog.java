package com.west.rtwomod.log;

import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoLog {
    public static final Block DWARFOAK_LOG = registerBlock("dwarfoak_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(6f).requiresTool()));
    public static final Block MOONWOOD_LOG = registerBlock("moonwood_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(6f).requiresTool()));
    public static final Block DWARFOAK_LEAVES = registerBlock("dwarfoak_leaves",
            new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(6f).requiresTool().noCollision()));
    public static final Block MOONWOOD_LEAVES = registerBlock("moonwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(6f).requiresTool().noCollision()));
    public static final Block SILVERLOG = registerBlock("silverlog",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).strength(6f).requiresTool()));
    public static final Block SILVER_LEAVES = registerBlock("silver_leaves",
            new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_GRAY).strength(6f).requiresTool().noCollision()));
    public static final Block DARKGLOW_LOG = registerBlock("darkglow_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).strength(6f).requiresTool().luminance(state -> 9)));
    public static final Block BURN_MORDOR_LOG = registerBlock("burn_mordor_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).strength(6f).requiresTool().luminance(state -> 9)));
    public static final Block BLUEGLOW_LOG = registerBlock("blueglow_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(6f).requiresTool().luminance(state -> 9)));
    public static final Block DWARF_PINE_LOG = registerBlock("dwarf_pine_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(6f).requiresTool().luminance(state -> 9)));






    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RTwomod.MOD_ID, name), block);

    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RTwomod.LOGGER.info("Registering Mod Blocks for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        });
    }

}

