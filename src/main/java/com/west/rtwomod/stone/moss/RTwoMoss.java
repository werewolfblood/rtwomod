package com.west.rtwomod.stone.moss;

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

public class RTwoMoss {
    public static final Block MOSS_STONE = registerBlock("moss_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3f)));
    public static final Block MOSS_STONE1 = registerBlock("moss_stone1",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3f)));
    public static final Block MOSS_STONE2 = registerBlock("moss_stone2",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3f)));
    public static final Block MOSS_STONE_1 = registerBlock("moss_stone_1",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3f)));
    public static final Block MOSS_STONE_2= registerBlock("moss_stone_2",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3f)));
    public static final Block MOSS_STONE3 = registerBlock("moss_stone3",
            new Block(AbstractBlock.Settings.create().strength(4f).mapColor(MapColor.GRAY)));
    public static final Block MOSS_STONE_3 = registerBlock("moss_stone_3",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).strength(3f)));


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

