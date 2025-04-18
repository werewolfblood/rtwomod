package com.west.rtwomod.fantasy.dnd;

import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoDnd {
    public static final Block SILVER_STONE = registerBlock("silver_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block DEEP_STONE = registerBlock("deep_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block DEEP_COBBLE = registerBlock("deep_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block TIN_COBBLE = registerBlock("tin_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block BLOOD_COBBLE = registerBlock("blood_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block NIGHT_COBBLE = registerBlock("night_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block MORIA_STONE = registerBlock("moria_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block MORIA_BRICK = registerBlock("moria_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block MORDOR_STEEL = registerBlock("mordor_steel",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).strength(5f)));
    public static final Block DEEP_MORDOR = registerBlock("deep_mordor",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK)));
    public static final Block ASH_LOG = registerBlock("ash_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK)));
    public static final Block ANGEL_LOG = registerBlock("angel_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK)));
    public static final Block ISTRON_LOG = registerBlock("istron_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK)));


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


