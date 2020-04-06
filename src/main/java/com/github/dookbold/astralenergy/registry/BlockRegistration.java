package com.github.dookbold.astralenergy.registry;

import com.github.dookbold.astralenergy.AstralEnergyMod;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistration {
    public static final Block ASTRAL_STONE = register(new Block(FabricBlockSettings.of(Material.STONE).build()), "astral_stone");
    public static final Block ASTRAL_BRICKS = register(new Block(FabricBlockSettings.of(Material.STONE).build()), "astral_bricks");
    public static final Block ASTRAL_CRACKED_BRICKS = register(new Block(FabricBlockSettings.of(Material.STONE).build()), "astral_cracked_bricks");
    public static final Block ASTRAL_MOSSY_BRICKS = register(new Block(FabricBlockSettings.of(Material.STONE).build()), "astral_mossy_bricks");

    public static void init() {}

    private static Block register(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(AstralEnergyMod.MOD_ID, name), block);
        BlockItem item = new BlockItem(block, ItemRegistration.defaultSettings());
        ItemRegistration.register(item, name);
        return block;
    }


}
