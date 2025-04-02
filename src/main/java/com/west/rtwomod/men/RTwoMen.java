package com.west.rtwomod.men;

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

public class RTwoMen {


    public static final Block COLD_STEEL = registerBlock("cold_steel",
            new Block(AbstractBlock.Settings.create().strength(10f).luminance(state -> 10)));
    public static final Block COLD_STEEL_BRICK = registerBlock("cold_steel_brick",
            new Block(AbstractBlock.Settings.create().strength(11f)));
    public static final Block EMERALD_STONE = registerBlock("emerald_stone",
            new Block(AbstractBlock.Settings.create().strength(11f).luminance(state -> 6)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RTwomod.MOD_ID, name), block);
    }
    public static <StoneBlock extends Block> void  registerBlockItem(String name, Block block ) {
        Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {
        RTwomod.LOGGER.info("Registering Mod Blocks for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        });
    }
}