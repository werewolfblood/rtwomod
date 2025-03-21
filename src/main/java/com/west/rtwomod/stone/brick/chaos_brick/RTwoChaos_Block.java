package com.west.rtwomod.stone.brick.chaos_brick;

import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoChaos_Block {
    public static final Block CHAOS_PILLAR = registerBlock("chaos_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(10f).luminance(state -> 7)));
    public static final Block CHAOS_STONE = registerBlock("chaos_stone",
            new Block(AbstractBlock.Settings.create().strength(9f).luminance(state -> 7)));
    public static final Block CHAOS_PILLAR_WALL = registerBlock("chaos_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(10f)));
    public static final Block CHAOS_COBBLE= registerBlock("chaos_cobble",
            new Block(AbstractBlock.Settings.create().strength(8f).luminance(state -> 7)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RTwomod.MOD_ID, name), block);
    }
    public static void  registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RTwomod.LOGGER.info("Registering Mod Blocks for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}

