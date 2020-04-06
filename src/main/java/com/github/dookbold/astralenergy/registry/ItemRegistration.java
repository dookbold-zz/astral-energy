package com.github.dookbold.astralenergy.registry;

import com.github.dookbold.astralenergy.AstralEnergyMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistration {
    public static final Item STELLARITE_INGOT = register(new Item(defaultSettings()), "stellarite_ingot");
    public static final Item STELLARITE_NUGGET = register(new Item(defaultSettings()), "stellarite_nugget");

    public static void init() {

    }

    public static Item register(Item item, String name) {
        return Registry.register(Registry.ITEM, new Identifier(AstralEnergyMod.MOD_ID, name), item);
    }

    public static Item.Settings defaultSettings() {
        return new Item.Settings().group(AstralEnergyMod.ASTRAL_ENERGY_GROUP);
    }
}
