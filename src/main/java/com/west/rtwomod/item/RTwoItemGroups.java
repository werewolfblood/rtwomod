package com.west.rtwomod.item;

import com.west.rtwomod.RTwomod;
import com.west.rtwomod.fantasy.RTwoFantasy;
import com.west.rtwomod.fantasy.dnd.RTwoDnd;
import com.west.rtwomod.log.RTwoLog;
import com.west.rtwomod.men.RTwoMen;
import com.west.rtwomod.stone.RTwoStone;
import com.west.rtwomod.stone.cobblestone.andesite.RTwoAndesite;
import com.west.rtwomod.stone.cobblestone.limestone.RTwoLimestone;
import com.west.rtwomod.stone.moss.RTwoMoss;
import com.west.rtwomod.stone.mycelium.RTwoMycelium;
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
                        entries.add(RTwoMen.COLD_STEEL_COBBLE);
                        entries.add(RTwoMen.COLD_STEEL_BRICK);
                        entries.add(RTwoMen.EMERALD_STONE);
                        entries.add(RTwoMen.EMERALD_STONE_BRICK);
                        entries.add(RTwoMen.LIMESTONE);
                        entries.add(RTwoMen.IRONTHAR);
                        entries.add(RTwoMen.GRAVOLYN_STONE);
                        entries.add(RTwoMen.GRAVOLYN_BRICK);
                        entries.add(RTwoMen.ZEPHYRITE);
                        entries.add(RTwoMen.BROGARIS_STONE);
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
                        entries.add(RTwoMen.STONE1);
                        entries.add(RTwoMen.WILLOW_STONE);
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
                        entries.add(RTwoFantasy.BLACK_STONE);
                        entries.add(RTwoFantasy.ANGBAND_STONE);
                        entries.add(RTwoFantasy.ANGBAND_BRICK);
                        entries.add(RTwoFantasy.DROWSTONE);
                        entries.add(RTwoFantasy.DROWSTONE_BRICKS);
                        entries.add(RTwoFantasy.DROW_BRICK);
                        entries.add(RTwoFantasy.MITHRIL_BRICK);
                        entries.add(RTwoFantasy.MITHRIL_COBBLE);
                        entries.add(RTwoFantasy.MITHRIL_BRICK1);
                        entries.add(RTwoFantasy.BLUEMOSS_STONE);
                        entries.add(RTwoFantasy.MORDOR_BRICK);
                        entries.add(RTwoFantasy.MORDOR_COBBLE);
                        entries.add(RTwoFantasy.MORDOR_COBBLE1);
                        entries.add(RTwoFantasy.MORDOR_STONE);
                        entries.add(RTwoFantasy.MORDOR_COBBLE_SLAB);
                        entries.add(RTwoFantasy.MITHRIL_LOG);
                        entries.add(RTwoFantasy.SUN_LOG);
                        entries.add(RTwoFantasy.SEVEN_LOG);
                        entries.add(RTwoFantasy.MITHRIL_BRICK_SLAB);
                        entries.add(RTwoFantasy.BLOODROOTS_LOG);
                        entries.add(RTwoFantasy.BLOODROOTS_LEAVES);
                        entries.add(RTwoFantasy.MORDOR_DIRT);
                        entries.add(RTwoFantasy.MORDOR_DIRT1);
                        entries.add(RTwoFantasy.CRYSTAL_DIRT);
                        entries.add(RTwoFantasy.CRYSTAL_DIRT1);
                        entries.add(RTwoFantasy.CRYSTAL_DIRT_SLAB);
                        entries.add(RTwoFantasy.MORDOR_DIRT_SLAB);
                        entries.add(RTwoFantasy.MORDOR_WALL);
                        entries.add(RTwoItem.MORDOR_PICKAXE);
                        entries.add(RTwoItem.BLACKIRON);
                        entries.add(RTwoItem.BLACKIRON_AXE);
                        entries.add(RTwoItem.BLACKIRON_SWORD);
                        entries.add(RTwoItem.BLACKRED);
                        entries.add(RTwoItem.COLD_STEEL_INGOT);
                        entries.add(RTwoItem.ANGBAND_PICKAXE);
                        entries.add(RTwoItem.ANGBAND_SWORD);
                        entries.add(RTwoItem.COLD_STEEL_PICKAXE);
                        entries.add(RTwoFantasy.CRETAN_STONE);
                        entries.add(RTwoItem.MORDOR_DAGGER);
                        entries.add(RTwoItem.WHITE_WIZZ_STAFF);
                        entries.add(RTwoFantasy.GREENELF_STONE);
                        entries.add(RTwoFantasy.DEADSAND);
                        entries.add(RTwoFantasy.SAND_BLOOD);
                        entries.add(RTwoFantasy.DEADSANDSTONE);







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
                        entries.add(RTwoLimestone.LIMESTONE7);
                        entries.add(RTwoLimestone.LIMESTONE8);
                        entries.add(RTwoLimestone.LIMESTONE9);
                        entries.add(RTwoLimestone.LIMESTONE10);
                        entries.add(RTwoLimestone.LIMESTONE_MOSS);
                        entries.add(RTwoLimestone.LIMESTONE_MOSS1);
                        entries.add(RTwoLimestone.LIMESTONE_LIGHT);
                        entries.add(RTwoLimestone.LIMESTONE_LIGHT1);
                        entries.add(RTwoLimestone.LIMESTONE_LIGHT2);
                        entries.add(RTwoLimestone.LIMESTONE11);
                        entries.add(RTwoLimestone.LIMESTONE12);







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
                       entries.add(RTwoAndesite.ANDESITE5);
                       entries.add(RTwoAndesite.ANDESITE6);
                       entries.add(RTwoAndesite.ANDESITE_STONE);
                       entries.add(RTwoAndesite.ANDESITE_STONE1);
                       entries.add(RTwoAndesite.ANDESITE_STONE2);
                       entries.add(RTwoAndesite.ANDESITE_STONE3);
                       entries.add(RTwoAndesite.ANDESITE_STONE4);
                       entries.add(RTwoAndesite.ANDESITE_COBBLE);
                       entries.add(RTwoAndesite.ANDESITE_COBBLE1);
                       entries.add(RTwoAndesite.ANDESITE_COBBLE2);
                       entries.add(RTwoAndesite.ANDESITE_COBBLE3);
                       entries.add(RTwoAndesite.ANDESITE_COBBLE4);







                    }).build());

    public static final ItemGroup moss = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "moss"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoMoss.MOSS_STONE))
                    .displayName(Text.translatable("itemgroup.rtwomod.moss"))
                    .entries((displayContext, entries) -> {
                       entries.add(RTwoMoss.MOSS_STONE);
                       entries.add(RTwoMoss.MOSS_STONE1);
                       entries.add(RTwoMoss.MOSS_STONE2);
                       entries.add(RTwoMoss.MOSS_STONE_1);
                       entries.add(RTwoMoss.MOSS_STONE_2);
                       entries.add(RTwoMoss.MOSS_STONE3);
                       entries.add(RTwoMoss.MOSS_STONE_3);







                    }).build());

    public static final ItemGroup mycelium = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "mycelium"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoMycelium.MYCELIUM))
                    .displayName(Text.translatable("itemgroup.rtwomod.mycelium"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoMycelium.MYCELIUM);
                        entries.add(RTwoMycelium.MYCELIUM_STONE);
                        entries.add(RTwoMycelium.MYCELIUM_STONE1);







                    }).build());
    public static final ItemGroup dnd = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "dnd"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoDnd.SILVER_STONE))
                    .displayName(Text.translatable("itemgroup.rtwomod.dnd"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoDnd.SILVER_STONE);
                        entries.add(RTwoDnd.DEEP_STONE);
                        entries.add(RTwoDnd.DEEP_COBBLE);
                        entries.add(RTwoDnd.TIN_COBBLE);
                        entries.add(RTwoDnd.BLOOD_COBBLE);
                        entries.add(RTwoDnd.NIGHT_COBBLE);
                        entries.add(RTwoDnd.MORIA_STONE);
                        entries.add(RTwoDnd.MORIA_BRICK);
                        entries.add(RTwoDnd.MORDOR_STEEL);
                        entries.add(RTwoDnd.DEEP_MORDOR);
                        entries.add(RTwoDnd.ASH_LOG);
                        entries.add(RTwoDnd.ANGEL_LOG);
                        entries.add(RTwoDnd.ISTRON_LOG);









                    }).build());
    public static void registerItemGroups() {
        RTwomod.LOGGER.info("Registering Item Groups for " + RTwomod.MOD_ID);
    }
}
