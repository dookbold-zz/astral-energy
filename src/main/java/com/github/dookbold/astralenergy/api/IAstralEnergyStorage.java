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
 * You should have received a copy of the GNU Lesser General Public License
 * along with Astral Energy.
 * @see https://www.gnu.org/licenses/
 */

package com.github.dookbold.astralenergy.api;

import java.math.BigInteger;

/**
 * A class used for displaying information about certain blocks which have some kind of Resonance buffer.
 * Generally should not be used to determine whether to provide energy to a block.
 * @author Patrick Emery
 */
public interface IAstralEnergyStorage {
    /**
     * This generally should not be used in place of canAcceptEnergy.
     * This is for displaying information only!
     * @return The amount of energy currently stored.
     */
    double getCurrentEnergy();

    /**
     * This generally should not be used in place of canAcceptEnergy.
     * This is for displaying information only!
     * @return The typical maximum amount of energy which can be stored
     */
    double getMaxEnergy();

    /**
     * @return How compressed energy in this machine is.
     */
    double getCompression();
}
