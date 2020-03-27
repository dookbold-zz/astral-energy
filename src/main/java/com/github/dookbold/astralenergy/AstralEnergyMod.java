/*
 * Copyright © 2020, Astral Energy contributors as found on the GitHub repository page, found at https://github.com/dookbold/astral-energy.
 * This file is part of Astral Energy.
 *
 * Astral Energy is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Astral Energy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Astral Energy.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package com.github.dookbold.astralenergy;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AstralEnergyMod implements ModInitializer {
    public static final String modid = "astralenergy";
    public static final ItemGroup ASTRAL_ENERGY_GROUP = FabricItemGroupBuilder.create(
            new Identifier("astralenergy", "general"))
            .icon(() -> new ItemStack(Items.DAYLIGHT_DETECTOR))
            .build();
    public static final Block ASTRAL_STONE = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block ASTRAL_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block ASTRAL_CRACKED_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Block ASTRAL_MOSSY_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).build());
    public static final Item TEMPORARY_KOBOLD = new Item(new Item.Settings().group(ASTRAL_ENERGY_GROUP));
    public static final Item STELLARITE_INGOT = new Item(new Item.Settings().group(ASTRAL_ENERGY_GROUP));
    public static final Item STELLARITE_NUGGET = new Item(new Item.Settings().group(ASTRAL_ENERGY_GROUP));
    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(modid, "astral_stone"), ASTRAL_STONE);
        Registry.register(Registry.BLOCK, new Identifier(modid, "astral_bricks"), ASTRAL_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(modid, "astral_cracked_bricks"), ASTRAL_CRACKED_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(modid, "astral_mossy_bricks"), ASTRAL_MOSSY_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(modid, "temporary_kobold"), TEMPORARY_KOBOLD);
        Registry.register(Registry.ITEM, new Identifier(modid, "stellarite_ingot"), STELLARITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(modid, "stellarite_nugget"), STELLARITE_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(modid, "astral_stone"),
                new BlockItem(ASTRAL_STONE, new Item.Settings().group(ASTRAL_ENERGY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(modid, "astral_bricks"),
                new BlockItem(ASTRAL_BRICKS, new Item.Settings().group(ASTRAL_ENERGY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(modid, "astral_cracked_bricks"),
                new BlockItem(ASTRAL_CRACKED_BRICKS, new Item.Settings().group(ASTRAL_ENERGY_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(modid, "astral_mossy_bricks"),
                new BlockItem(ASTRAL_MOSSY_BRICKS, new Item.Settings().group(ASTRAL_ENERGY_GROUP)));
    }
}
