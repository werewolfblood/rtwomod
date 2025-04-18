package com.west.rtwomod.stone.cobblestone.limestone;

import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoLimestone {
    public static final Block LIMESTONE1 = registerBlock("limestone1", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.7F)));
    public static final Block LIMESTONE2 = registerBlock("limestone2", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE3 = registerBlock("limestone3", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE4 = registerBlock("limestone4", new Cobble(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE5 = registerBlock("limestone5", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE6 = registerBlock("limestone6", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE7 = registerBlock("limestone7", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE8 = registerBlock("limestone8", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.2F)));
    public static final Block LIMESTONE9 = registerBlock("limestone9", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.2F)));
    public static final Block LIMESTONE10 = registerBlock("limestone10", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(0.4F)));
    public static final Block LIMESTONE_MOSS = registerBlock("limestone_moss", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));
    public static final Block LIMESTONE_MOSS1 = registerBlock("limestone_moss1", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));
    public static final Block LIMESTONE_LIGHT = registerBlock("limestone_light", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));
    public static final Block LIMESTONE_LIGHT1 = registerBlock("limestone_light1", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));
    public static final Block LIMESTONE_LIGHT2 = registerBlock("limestone_light2", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));
    public static final Block LIMESTONE11 = registerBlock("limestone11", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));
    public static final Block LIMESTONE12 = registerBlock("limestone12", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(4F)));








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

