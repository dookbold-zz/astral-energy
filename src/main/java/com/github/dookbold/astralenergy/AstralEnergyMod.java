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

import com.github.dookbold.astralenergy.registry.AEBlockRegistration;
import com.github.dookbold.astralenergy.registry.AEItemRegistration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class AstralEnergyMod implements ModInitializer {
    public static final String MOD_ID = "astralenergy";
    public static final ItemGroup ASTRAL_ENERGY_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(Items.DAYLIGHT_DETECTOR))
            .build();

    @Override
    public void onInitialize() {
        AEItemRegistration.init();
        AEBlockRegistration.init();

    }
}
