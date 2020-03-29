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
 * A functional interface used to provide power to certain blocks.
 * @author Patrick Emery
 */
public interface IAstralEnergyAcceptor {
    /**
     * A method for determining whether a machine can accept Resonance.
     * @param amount The amount of energy being input.
     * @param compression How compressed this energy is.
     * @return Whether this machine can accept this.
     */
    boolean canAcceptEnergy(int amount, double compression);

    /**
     * A method for adding energy to a machine.
     * @param amount The amount of energy being input.
     * @param compression How compressed this energy is.
     */
    void insertEnergy(int amount, double compression);
}
