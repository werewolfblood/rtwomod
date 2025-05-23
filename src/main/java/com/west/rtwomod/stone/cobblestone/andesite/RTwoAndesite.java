package com.west.rtwomod.stone.cobblestone.andesite;

import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoAndesite {
    public static final Block ANDESITE = registerBlock("andesite",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f)));
    public static final Block ANDESITE1 = registerBlock("andesite1",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f)));
    public static final Block ANDESITE2 = registerBlock("andesite2",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f)));
    public static final Block ANDESITE3 = registerBlock("andesite3",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f)));
    public static final Block ANDESITE4 = registerBlock("andesite4",
            new Cobble(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.0f)));
    public static final Block ANDESITE5 = registerBlock("andesite5",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(4f).requiresTool()));
    public static final Block ANDESITE6 = registerBlock("andesite6",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).requiresTool().strength(4f)));
    public static final Block ANDESITE_STONE = registerBlock("andesite_stone",
            new Block(AbstractBlock.Settings.create().strength(4F).mapColor(MapColor.GRAY)));
    public static final Block ANDESITE_STONE1 = registerBlock("andesite_stone1",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(4f)));
    public static final Block ANDESITE_STONE2 = registerBlock("andesite_stone2",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(4f)));
    public static final Block ANDESITE_STONE3 = registerBlock("andesite_stone3",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(4f)));
    public static final Block ANDESITE_STONE4 = registerBlock("andesite_stone4",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(4f)));
    public static final Block ANDESITE_COBBLE = registerBlock("andesite_cobble",
            new Block(AbstractBlock.Settings.create().strength(3F).mapColor(MapColor.GRAY)));
    public static final Block ANDESITE_COBBLE1 = registerBlock("andesite_cobble1",
            new Block(AbstractBlock.Settings.create().strength(3F).mapColor(MapColor.GRAY)));
    public static final Block ANDESITE_COBBLE2 = registerBlock("andesite_cobble2",
            new Block(AbstractBlock.Settings.create().strength(3F).mapColor(MapColor.GRAY)));
    public static final Block ANDESITE_COBBLE3 = registerBlock("andesite_cobble3",
            new Block(AbstractBlock.Settings.create().strength(3F).mapColor(MapColor.GRAY)));
    public static final Block ANDESITE_COBBLE4 = registerBlock("andesite_cobble4",
            new Cobble(AbstractBlock.Settings.create().strength(3F).mapColor(MapColor.GRAY)));





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

