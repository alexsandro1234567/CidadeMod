package com.exemplo.cidademod.customization;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Decoration {
    private final Block block;
    private final BlockPos relativePos;

    public Decoration(Block block, BlockPos relativePos) {
        this.block = block;
        this.relativePos = relativePos;
    }

    public void place(Level level, BlockPos origin) {
        BlockPos targetPos = origin.offset(relativePos);
        level.setBlock(targetPos, block.defaultBlockState(), 3);
    }
} 