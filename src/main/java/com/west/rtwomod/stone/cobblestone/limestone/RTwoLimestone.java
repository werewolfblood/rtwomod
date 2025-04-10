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
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(9F)));
    public static final Block LIMESTONE2 = registerBlock("limestone2", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(9F)));
    public static final Block LIMESTONE3 = registerBlock("limestone3", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(9F)));
    public static final Block LIMESTONE4 = registerBlock("limestone4", new Cobble(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(9F)));
    public static final Block LIMESTONE5 = registerBlock("limestone5", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(9F)));
    public static final Block LIMESTONE6 = registerBlock("limestone6", new Block(
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(9F)));





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

