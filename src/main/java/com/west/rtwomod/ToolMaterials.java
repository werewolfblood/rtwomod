package com.west.rtwomod;


import com.google.common.base.Suppliers;
import com.west.rtwomod.util.RTwoTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;


public enum ToolMaterials implements ToolMaterial {
    BLACKIRON(RTwoTags.Blocks.INCORRECT_MORDOR_TOOL, 3021, 12.0F, 9.0F, 20,() -> Ingredient.ofItems(Items.IRON_INGOT)),
    BLACKRED(RTwoTags.Blocks.INCORRECT_ANGBAND_TOOL, 3021, 20.0F, 10.0F, 20,()-> Ingredient.ofItems(Items.IRON_INGOT)),
    COLD_STEEL_INGOT(RTwoTags.Blocks.INCORRECT_COLD_STEEL_TOOL, 4021, 13.0F, 10.0F, 30,()-> Ingredient.ofItems(Items.IRON_INGOT));
    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

     ToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}