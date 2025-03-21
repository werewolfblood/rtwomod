package com.west.rtwomod.stone.dwarf_stone;

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

public class RTwoDwarfStone {
    public static final Block DWARF_STONE = registerBlock("dwarf_stone",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_STONE_WAY = registerBlock("dwarf_stone_way",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_LIGHT = registerBlock("dwarf_light",
            new Block(AbstractBlock.Settings.create().strength(6f).luminance(state -> 7)));
    public static final Block DWARF_BRICK = registerBlock("dwarf_brick",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_BRICK1 = registerBlock("dwarf_brick1",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_BRICK_SLAB = registerBlock("dwarf_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_STONE_SLAB = registerBlock("dwarf_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_PILLAR = registerBlock("dwarf_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(9f)));
    public static final Block DWARF_COBBLE = registerBlock("dwarf_cobble",
            new Block(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_PILLAR1 = registerBlock("dwarf_pillar1",
            new PillarBlock(AbstractBlock.Settings.create().strength(9f)));
    public static final Block DWARF_PILLAR1_WALL = registerBlock("dwarf_pillar1_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(9f)));
    public static final Block DWARF_COBBLE1 = registerBlock("dwarf_cobble1",
            new Cobble(AbstractBlock.Settings.create().strength(7f)));
    public static final Block DWARF_STONE1 = registerBlock("dwarf_stone1",
            new SnowBlock(AbstractBlock.Settings.create().strength(7f)));


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