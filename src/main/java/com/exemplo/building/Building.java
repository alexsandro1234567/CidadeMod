package com.exemplo.cidademod.building;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Building {
    private final BlockPos position;
    private final BuildingTheme theme;
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;

    public Building(BlockPos pos, BuildingTheme theme, int sizeX, int sizeY, int sizeZ) {
        this.position = pos;
        this.theme = theme;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    public void build(World world) {
        // Implementação da construção virá depois
    }

    public BlockPos getPosition() {
        return position;
    }

    public BuildingTheme getTheme() {
        return theme;
    }
} 