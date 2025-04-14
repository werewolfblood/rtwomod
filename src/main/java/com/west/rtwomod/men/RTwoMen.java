package com.west.rtwomod.men;

import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoMen {


    public static final Block COLD_STEEL = registerBlock("cold_steel",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(5f).luminance(state -> 10)));
    public static final Block COLD_STEEL_COBBLE = registerBlock("cold_steel_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(5f).luminance(state -> 10)));
    public static final Block COLD_STEEL_BRICK = registerBlock("cold_steel_brick",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block EMERALD_STONE = registerBlock("emerald_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(5f).luminance(state -> 6)));
    public static final Block EMERALD_STONE_BRICK = registerBlock("emerald_stone_brick",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block IRONTHAR = registerBlock("ironthar",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block GRAVOLYN = registerBlock("gravolyn",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block GRAVOLYN_BRICK = registerBlock("gravolyn_brick",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block ZEPHYRITE = registerBlock("zephyrite",
            new Block(AbstractBlock.Settings.create().strength(5f)));
    public static final Block BROGARIS = registerBlock("brogaris",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(8f)));
    public static final Block BROGARIS_BRICK = registerBlock("brogaris_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(8f)));
    public static final Block GRAY_BRICK = registerBlock("gray_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(8f)));
    public static final Block GRAY_STONE = registerBlock("gray_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(8f)));
    public static final Block DEEPGRAY_STONE = registerBlock("deepgray_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(8f)));
    public static final Block DEEPGRAY_BRICK = registerBlock("deepgray_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(8f)));
    public static final Block MEN_WIZ_GLASS = registerBlock("men_wiz_glass",
            new Block(AbstractBlock.Settings.copy(Blocks.GLASS).mapColor(MapColor.BLUE).breakInstantly()));
    public static final Block WHISPERWOOD_LOG = registerBlock("whisperwood_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(9f)));
    public static final Block WHISPERLEAVES = registerBlock("whisperleaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.BROWN).noCollision()));
    public static final Block EMBERBARK_LOG = registerBlock("emberbark_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(10F)));
    public static final Block EMBERLEAVES = registerBlock("emberleaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.RED)));
    public static final Block BRIMSTONE = registerBlock("brimstone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.YELLOW).strength(10f)));


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