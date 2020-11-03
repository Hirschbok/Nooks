package com.hirschbok.nooks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetheritePowderBlock extends Block {

    public NetheritePowderBlock() {
        super(Block.Properties.create(Material.SAND)
            .hardnessAndResistance(0.5f, 0.5f)
            .sound(SoundType.SAND)
            .harvestLevel(1)
            .harvestTool(ToolType.SHOVEL)
            .func_235861_h_());
    }
}
