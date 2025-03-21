package com.west.rtwomod.rock;

import com.west.rtwomod.Cobble;
import com.west.rtwomod.RTwomod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoRock {
    public static final Block CHALK = registerBlock("chalk",
            new Block(AbstractBlock.Settings.create().strength(6f)));
    public static final Block CHALK1 = registerBlock("chalk1",
            new Block(AbstractBlock.Settings.create().strength(6f)));
    public static final Block CHALK2 = registerBlock("chalk2",
            new Block(AbstractBlock.Settings.create().strength(6f)));
    public static final Block CHALK3 = registerBlock("chalk3",
            new Block(AbstractBlock.Settings.create().strength(6f)));
    public static final Block CHALK4 = registerBlock("chalk4",
            new Cobble(AbstractBlock.Settings.create().strength(6f)));




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
