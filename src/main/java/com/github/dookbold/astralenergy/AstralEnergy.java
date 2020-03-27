package com.github.dookbold.astralenergy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AstralEnergy implements ModInitializer {
    public static final ItemGroup ASTRAL_ENERGY_GROUP = FabricItemGroupBuilder.create(
            new Identifier("astralenergy", "general"))
            .icon(() -> new ItemStack(Items.DAYLIGHT_DETECTOR))
            .build();
    public static final Item TEMPORARY_KOBOLD = new Item(new Item.Settings().group(ASTRAL_ENERGY_GROUP));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("astralenergy", "temporary_kobold"), TEMPORARY_KOBOLD);

    }
}
