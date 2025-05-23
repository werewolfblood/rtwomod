package com.west.rtwomod.util;

import com.west.rtwomod.RTwomod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class RTwoTags {
    public static class Blocks {
        public static final TagKey<Block> NEED_MORDOR_TOOL = createTag("need_mordor_tool");
        public static final TagKey<Block> INCORRECT_MORDOR_TOOL = createTag("incorrect_mordor_tool");
        public static final TagKey<Block> INCORRECT_ANGBAND_TOOL = createTag("incorrect_angband_tool");
        public static final TagKey<Block> INCORRECT_COLD_STEEL_TOOL = createTag("incorrect_cold_steel_tool");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RTwomod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RTwomod.MOD_ID, name));
        }
    }
}

