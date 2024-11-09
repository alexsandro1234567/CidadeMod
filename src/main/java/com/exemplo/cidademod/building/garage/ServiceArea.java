package com.exemplo.cidademod.building.garage;

import net.minecraft.util.math.BlockPos;

public class ServiceArea {
    private final BlockPos position;
    private boolean inUse;

    public ServiceArea(BlockPos position) {
        this.position = position;
        this.inUse = false;
    }

    public BlockPos getPosition() {
        return position;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
} 