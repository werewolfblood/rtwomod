package com.west.rtwomod.stone;

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

public class RTwoStone {
    public static final Block PATH_STONE = registerBlock("path_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(2f)));
    public static final Block PATH_STONE1 = registerBlock("path_stone1",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(2f)));
    public static final Block PATH_STONE2 = registerBlock("path_stone2",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(2f)));
    public static final Block PATH_STONE3 = registerBlock("path_stone3",
            new Cobble(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).strength(2f)));
   public static final Block DEEP_REDSTONE = registerBlock("deep_redstone",
           new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).strength(4F)));
   public static final Block DEEP_GLOWSTONE = registerBlock("deep_glowstone",
           new Block(AbstractBlock.Settings.create().mapColor(MapColor.CYAN).luminance(state -> 9)));
   public static final  Block DEEP_MITHRIL_STONE = registerBlock("deep_mithril_stone",
           new Block(AbstractBlock.Settings.create().mapColor(MapColor.BLUE).strength(3F).luminance(state -> 9)));




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
