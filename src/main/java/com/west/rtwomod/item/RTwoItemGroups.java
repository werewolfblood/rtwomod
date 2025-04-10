package com.west.rtwomod.item;

import com.west.rtwomod.RTwomod;
import com.west.rtwomod.fantasy.RTwoFantasy;
import com.west.rtwomod.log.RTwoLog;
import com.west.rtwomod.men.RTwoMen;
import com.west.rtwomod.stone.RTwoStone;
import com.west.rtwomod.stone.cobblestone.andesite.RTwoAndesite;
import com.west.rtwomod.stone.cobblestone.limestone.RTwoLimestone;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class RTwoItemGroups {

    public static final ItemGroup men = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "men"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoMen.COLD_STEEL))
                    .displayName(Text.translatable("itemgroup.rtwomod.men"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoMen.COLD_STEEL);
                        entries.add(RTwoMen.COLD_STEEL_BRICK);
                        entries.add(RTwoMen.EMERALD_STONE);
                        entries.add(RTwoMen.EMERALD_STONE_BRICK);
                        entries.add(RTwoMen.LIMESTONE);
                        entries.add(RTwoMen.IRONTHAR);
                        entries.add(RTwoMen.GRAVOLYN);
                        entries.add(RTwoMen.GRAVOLYN_BRICK);
                        entries.add(RTwoMen.ZEPHYRITE);
                        entries.add(RTwoMen.BROGARIS);
                        entries.add(RTwoMen.BROGARIS_BRICK);
                        entries.add(RTwoMen.GRAY_BRICK);
                        entries.add(RTwoMen.GRAY_STONE);
                        entries.add(RTwoMen.DEEPGRAY_STONE);
                        entries.add(RTwoMen.DEEPGRAY_BRICK);
                        entries.add(RTwoMen.MEN_WIZ_GLASS);
                        entries.add(RTwoMen.WHISPERWOOD_LOG);
                        entries.add(RTwoMen.WHISPERLEAVES);
                        entries.add(RTwoMen.EMBERBARK_LOG);
                        entries.add(RTwoMen.EMBERLEAVES);
                        entries.add(RTwoMen.BRIMSTONE);
                    }).build());




    public static final ItemGroup log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoLog.DWARFOAK_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.log"))
                    .entries((displayContext, entries) -> {
                       entries.add(RTwoLog.DWARFOAK_LOG);
                       entries.add(RTwoLog.MOONWOOD_LOG);
                       entries.add(RTwoLog.DWARFOAK_LEAVES);
                       entries.add(RTwoLog.MOONWOOD_LEAVES);
                       entries.add(RTwoLog.SILVERLOG);
                        entries.add(RTwoLog.SILVER_LEAVES);
                       entries.add(RTwoLog.DARKGLOW_LOG);
                        entries.add(RTwoLog.BURN_MORDOR_LOG);
                        entries.add(RTwoLog.BLUEGLOW_LOG);
                        entries.add(RTwoLog.DWARF_PINE_LOG);







                    }).build());
    public static final ItemGroup fantasy = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "fantasy"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoFantasy.DROWSTONE))
                    .displayName(Text.translatable("itemgroup.rtwomod.fantasy"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoFantasy.DROWSTONE);
                        entries.add(RTwoFantasy.DROWSTONE_BRICKS);
                        entries.add(RTwoFantasy.DROW_BRICK);
                        entries.add(RTwoFantasy.MITHRIL_BRICK);
                        entries.add(RTwoFantasy.MORDOR_BRICK);
                        entries.add(RTwoFantasy.MORDOR_COBBLE);
                        entries.add(RTwoFantasy.MORDOR_COBBLE1);
                        entries.add(RTwoFantasy.MORDOR_COBBLE_SLAB);
                        entries.add(RTwoFantasy.MITHRIL_LOG);
                        entries.add(RTwoFantasy.MITHRIL_BRICK_SLAB);







                    }).build());
    public static final ItemGroup stone = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "stone"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoStone.PATH_STONE))
                    .displayName(Text.translatable("itemgroup.rtwomod.stone"))
                    .entries((displayContext, entries) -> {
                         entries.add(RTwoStone.PATH_STONE);
                        entries.add(RTwoStone.PATH_STONE1);
                        entries.add(RTwoStone.PATH_STONE2);
                        entries.add(RTwoStone.PATH_STONE3);







                    }).build());
    public static final ItemGroup limestone = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "limestone"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoLimestone.LIMESTONE1))
                    .displayName(Text.translatable("itemgroup.rtwomod.limestone"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoLimestone.LIMESTONE1);
                        entries.add(RTwoLimestone.LIMESTONE2);
                        entries.add(RTwoLimestone.LIMESTONE3);
                        entries.add(RTwoLimestone.LIMESTONE4);
                        entries.add(RTwoLimestone.LIMESTONE5);
                        entries.add(RTwoLimestone.LIMESTONE6);







                    }).build());
    public static final ItemGroup andesite = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "andesite"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoAndesite.ANDESITE))
                    .displayName(Text.translatable("itemgroup.rtwomod.ANDESITE"))
                    .entries((displayContext, entries) -> {
                       entries.add(RTwoAndesite.ANDESITE);
                       entries.add(RTwoAndesite.ANDESITE1);
                       entries.add(RTwoAndesite.ANDESITE2);
                       entries.add(RTwoAndesite.ANDESITE3);
                       entries.add(RTwoAndesite.ANDESITE4);







                    }).build());
    public static void registerItemGroups() {
        RTwomod.LOGGER.info("Registering Item Groups for " + RTwomod.MOD_ID);
    }
}
