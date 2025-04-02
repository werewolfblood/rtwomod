package com.west.rtwomod.item;

import com.west.rtwomod.RTwomod;
import com.west.rtwomod.men.RTwoMen;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class RTwoItemGroups {

    public static final ItemGroup men = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RTwomod.MOD_ID, "cold steel"),
            FabricItemGroup.builder().icon(() -> new ItemStack(RTwoMen.COLD_STEEL))
                    .displayName(Text.translatable("itemgroup.rtwomod.cold_steel"))
                    .entries((displayContext, entries) -> {
                        entries.add(RTwoMen.COLD_STEEL);
                        entries.add(RTwoMen.COLD_STEEL_BRICK);
                        entries.add(RTwoMen.EMERALD_STONE);
                    }).build());









    public static void registerItemGroups() {
        RTwomod.LOGGER.info("Registering Item Groups for " + RTwomod.MOD_ID);
    }
}
