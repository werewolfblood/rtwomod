package com.west.rtwomod.item;

import com.west.rtwomod.RTwomod;
import com.west.rtwomod.log.RTwoLog;
import com.west.rtwomod.log.dark_elf_log.RTwoDark_Elf_Log;
import com.west.rtwomod.log.dwarf_log.RTwoDwarf_log;
import com.west.rtwomod.log.silver_log.RTwoSilver_log;
import com.west.rtwomod.log.skaven_log.RTwoSkaven_log;
import com.west.rtwomod.log.sunelf_log.RTwoSunElf_log;
import com.west.rtwomod.rock.RTwoRock;
import com.west.rtwomod.stone.RTwoStone;
import com.west.rtwomod.stone.brick.RTwoBrick;
import com.west.rtwomod.stone.brick.chaos_brick.RTwoChaos_Block;
import com.west.rtwomod.stone.brick.drow_brick.RTwoDrowBrick;
import com.west.rtwomod.stone.dwarf_stone.RTwoDwarfStone;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class RTwoItemGroups {


    public static final ItemGroup log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "blueglow_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoLog.BLUEGLOW_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.blueglow_log"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoLog.BLUEGLOW_LOG);
                        entries.add(RTwoLog.STRIPPED_BLUEGLOW_LOG);
                        entries.add(RTwoLog.REDWOOD_PLANKS);
                        entries.add(RTwoLog.WALNUT_PLANKS);
                        entries.add(RTwoLog.WALNUT_SLAB);




                     }).build());



    public static final ItemGroup dark_elf_log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "dark_elf_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoDark_Elf_Log.DARK_ELF_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.dark_elf_log"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoDark_Elf_Log.DARK_ELF_LOG);
                        entries.add(RTwoDark_Elf_Log.STRIPPED_DARK_ELF_LOG);
                        entries.add(RTwoDark_Elf_Log.DARK_ELF_LOG1);
                        entries.add(RTwoDark_Elf_Log.DARK_ELF_LOG2);
                        entries.add(RTwoDark_Elf_Log.DARK_ELF_LOG3);
                        entries.add(RTwoDark_Elf_Log.DARK_ELF_LOG4);




                    }).build());



    public static final ItemGroup dwarf_log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "dwarf_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoDwarf_log.DWARF_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.dwarf_log"))
                    .entries((displayContext, entries) -> {
                      entries.add(RTwoDwarf_log.DWARF_LOG);
                      entries.add(RTwoDwarf_log.DWARF_PLANKS);
                      entries.add(RTwoDwarf_log.DWARF_PLANKS_WALL);
                      entries.add(RTwoDwarf_log.DWARF_PLANKS1);
                      entries.add(RTwoDwarf_log.DWARF_BRANCH1);
                      entries.add(RTwoDwarf_log.BEAM);





                    }).build());
    public static final ItemGroup silver_log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "silver_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoSilver_log.SILVER_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.silver_log"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoSilver_log.SILVER_LOG);




                    }).build());
    public static final ItemGroup skaven_log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "skaven_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoSkaven_log.SKAVEN_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.skaven_log"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoSkaven_log.SKAVEN_LOG);
                        entries.add(RTwoSkaven_log.SKAVEN_LOG1);




                    }).build());
    public static final ItemGroup sunelf_log = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "sunelf_log"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoSunElf_log.SUNELF_LOG))
                    .displayName(Text.translatable("itemgroup.rtwomod.sunelf_log"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoSunElf_log.SUNELF_LOG);
                        entries.add(RTwoSunElf_log.SUNELF_LOG1);




                    }).build());




    public static final ItemGroup stone = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "stone"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoStone.STONE1))
                    .displayName(Text.translatable("itemgroup.rtwomod.stone"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoStone.STONE1);
                        entries.add(RTwoStone.STONE2);
                        entries.add(RTwoStone.STONE3);
                        entries.add(RTwoStone.STONE4);
                        entries.add(RTwoStone.STONE5);
                        entries.add(RTwoStone.STONE_1);




                    }).build());


    public static final ItemGroup brick = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "brick"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoBrick.LIMESTONE))
                    .displayName(Text.translatable("itemgroup.rtwomod.limestone"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoBrick.LIMESTONE);
                        entries.add(RTwoBrick.LIMESTONE1);
                        entries.add(RTwoBrick.LIMESTONE2);

                    }).build());

    public static final ItemGroup chaos_brick = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "chaos_brick"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoChaos_Block.CHAOS_PILLAR))
                    .displayName(Text.translatable("itemgroup.rtwomod.chaos_stone"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoChaos_Block.CHAOS_PILLAR);
                        entries.add(RTwoChaos_Block.CHAOS_STONE);
                        entries.add(RTwoChaos_Block.CHAOS_PILLAR_WALL);
                        entries.add(RTwoChaos_Block.CHAOS_COBBLE);




                    }).build());
    public static final ItemGroup drow_brick = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "drow_brick"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoDrowBrick.DROW_BRICK))
                    .displayName(Text.translatable("itemgroup.rtwomod.drow_brick"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoDrowBrick.DROW_BRICK);
                        entries.add(RTwoDrowBrick.DROW_BRICK1);

                    }).build());
    public static final ItemGroup dwarf_stone = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "dwarf_stone"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoDwarfStone.DWARF_STONE))
                    .displayName(Text.translatable("itemgroup.rtwomod.dwarf_stone"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoDwarfStone.DWARF_STONE);
                        entries.add(RTwoDwarfStone.DWARF_STONE_WAY);
                        entries.add(RTwoDwarfStone.DWARF_LIGHT);
                        entries.add(RTwoDwarfStone.DWARF_BRICK);
                        entries.add(RTwoDwarfStone.DWARF_BRICK1);
                        entries.add(RTwoDwarfStone.DWARF_BRICK_SLAB);
                        entries.add(RTwoDwarfStone.DWARF_STONE_SLAB);
                        entries.add(RTwoDwarfStone.DWARF_PILLAR);
                        entries.add(RTwoDwarfStone.DWARF_PILLAR1);
                        entries.add(RTwoDwarfStone.DWARF_COBBLE);
                        entries.add(RTwoDwarfStone.DWARF_PILLAR1_WALL);
                        entries.add(RTwoDwarfStone.DWARF_COBBLE1);
                        entries.add(RTwoDwarfStone.DWARF_STONE1);





                    }).build());
    public static final ItemGroup rock = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "rock"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoRock.CHALK))
                    .displayName(Text.translatable("itemgroup.rtwomod.chalk"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoRock.CHALK);
                        entries.add(RTwoRock.CHALK1);
                        entries.add(RTwoRock.CHALK2);
                        entries.add(RTwoRock.CHALK3);
                        entries.add(RTwoRock.CHALK4);

                    }).build());









    public static void registerItemGroups() {
        RTwomod.LOGGER.info("Registering Item Groups for " + RTwomod.MOD_ID);
    }
}
