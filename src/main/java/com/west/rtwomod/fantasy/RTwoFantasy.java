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
import net.minecraft.util.Identifier;

public class RTwoFantasy {
    public static final Block DROWSTONE = registerBlock("drowstone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).strength(10f).luminance(state -> 9)));
    public static final Block DROWSTONE_BRICKS = registerBlock("drowstone_bricks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).strength(10f).luminance(state -> 9)));
    public static final Block DROW_BRICK = registerBlock("drow_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(10f)));
    public static final Block MITHRIL_BRICK = registerBlock("mithril_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(10f)));
    public static final Block MORDOR_BRICK = registerBlock("mordor_brick",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(10f)));
    public static final Block MORDOR_COBBLE = registerBlock("mordor_cobble",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(10f)));
    public static final Block MORDOR_COBBLE_SLAB = registerBlock("mordor_cobble_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(10f)));
    public static final Block MORDOR_COBBLE1 = registerBlock("mordor_cobble1",
            new Cobble(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).strength(10f)));
    public static final Block MITHRIL_LOG = registerBlock("mithril_log",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(10f).requiresTool()));
    public static final Block MITHRIL_BRICK_SLAB = registerBlock("mithril_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE).strength(10f).requiresTool()));






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
