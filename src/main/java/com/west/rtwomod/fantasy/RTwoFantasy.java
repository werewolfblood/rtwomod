package com.west.rtwomod.fantasy;

import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class RTwoFantasy {
    public static final Block DROWSTONE = registerBlock("drowstone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).strength(3f).luminance(state -> 9)));
    public static final Block DROWSTONE_BRICKS = registerBlock("drowstone_bricks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).strength(3f).luminance(state -> 9)));
    public static final Block DROW_BRICK = registerBlock("drow_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block MITHRIL_BRICK = registerBlock("mithril_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(6f)));
    public static final Block MORDOR_BRICK = registerBlock("mordor_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block MORDOR_COBBLE = registerBlock("mordor_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block MORDOR_STONE = registerBlock("mordor_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block MORDOR_COBBLE_SLAB = registerBlock("mordor_cobble_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block MORDOR_COBBLE1 = registerBlock("mordor_cobble1",
            new Cobble(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block ANGBAND_STONE = registerBlock("angband_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block ANGBAND_BRICK = registerBlock("angband_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block MITHRIL_LOG = registerBlock("mithril_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(7f).requiresTool()));
    public static final Block MITHRIL_BRICK_SLAB = registerBlock("mithril_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(6f).requiresTool()));
    public static final Block SUN_LOG = registerBlock("sun_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(7f).requiresTool()));
    public static final Block SEVEN_LOG = registerBlock("seven_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(7f).requiresTool()));
    public static final Block BLOODROOTS_LOG = registerBlock("bloodroots_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(10f).requiresTool()));
    public static final Block BLOODROOTS_LEAVES = registerBlock("bloodroots_leaves",
            new LeavesBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(10f).requiresTool().noCollision()));
    public static final Block MORDOR_DIRT = registerBlock("mordor_dirt",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block MORDOR_DIRT1 = registerBlock("mordor_dirt1",
            new Cobble(AbstractBlock.Settings.copy(Blocks.DIRT).mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block CRYSTAL_DIRT = registerBlock("crystal_dirt",
            new Block(AbstractBlock.Settings.copy(Blocks.DIRT).mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block CRYSTAL_DIRT1 = registerBlock("crystal_dirt1",
            new Cobble(AbstractBlock.Settings.copy(Blocks.DIRT).mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block CRYSTAL_DIRT_SLAB = registerBlock("crystal_dirt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT).mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block MORDOR_DIRT_SLAB = registerBlock("mordor_dirt_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block MORDOR_WALL = registerBlock("mordor_wall",
            new WallBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block CRETAN_STONE = registerBlock("cretan_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(2.0f).requiresTool()));
    public static final Block BLUEMOSS_STONE = registerBlock("bluemoss_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.MOSSY_COBBLESTONE).requiresTool().mapColor(DyeColor.GREEN)));
    public static final Block MITHRIL_COBBLE = registerBlock("mithril_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(3F)));
    public static final Block MITHRIL_BRICK1 = registerBlock("mithril_brick1",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(4F)));
    public static final Block BLACK_STONE = registerBlock("black_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block GREENELF_STONE = registerBlock("greenelf_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(6f)));
    public static final Block TOMESTONE = registerBlock("tomestone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(5f)));
    public static final Block DEADSAND = registerBlock("deadsand",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(3F)));
    public static final Block SAND_BLOOD = registerBlock("sand_blood",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(4f)));
    public static final Block DEADSANDSTONE = registerBlock("deadsandstone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(4f)));











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
