package com.west.rtwomod.item;


import com.west.rtwomod.RTwomod;
import com.west.rtwomod.ToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RTwoItem {
    public static final Item WHITE_WIZZ_STAFF = registerItem("white_wizz_staff", new WizStaff(new Item.Settings()));
    public static final Item MORDOR_DAGGER = registerItem("mordor_dagger", new Mordor_Dagger(new Item.Settings()));
    public static final Item MORDOR_PICKAXE = registerItem("mordor_pickaxe", new Mordor_PickAxe(new Item.Settings()
      .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.BLACKIRON, 1.0f, -2.4f))));
    public static final Item BLACKIRON  = registerItem("blackiron", new Item(new Item.Settings()));
    public static final Item BLACKIRON_AXE = registerItem("blackiron_axe", new Item(new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.BLACKIRON,6.0f, -3.2f))));
    public static final Item BLACKIRON_SWORD = registerItem("blackiron_sword", new Item(new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.BLACKIRON, 3, -2.4f))));
    public static final Item BLACKRED = registerItem("blackred", new Item(new Item.Settings()));
    public static final Item COLD_STEEL_INGOT = registerItem("cold_steel_ingot", new Item(new Item.Settings()));
    public static final Item ANGBAND_PICKAXE = registerItem("angband_pickaxe", new Item(new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.BLACKIRON, 1.0f, -2.4f))));
    public static final Item ANGBAND_SWORD = registerItem("angband_sword", new Item(new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.BLACKRED, 3, -2.4f))));
    public static final Item COLD_STEEL_PICKAXE = registerItem("cold_steel_pickaxe", new Item(new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.COLD_STEEL_INGOT, 3, -2.4f))));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RTwomod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RTwomod.LOGGER.info("Registering Mod Items for " + RTwomod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
