package com.west.rtwomod.stone;

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

public class RTwoStone {

   public static final Block STONE1 = registerBlock("stone1",
           new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block STONE_1 = registerBlock("stone_1",
            new Cobble(AbstractBlock.Settings.create().strength(7f)));
    public static final Block STONE2 = registerBlock("stone2",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block STONE3 = registerBlock("stone3",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block STONE4 = registerBlock("stone4",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block STONE5 = registerBlock("stone5",
            new Block(AbstractBlock.Settings.create().strength(7f)));

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
