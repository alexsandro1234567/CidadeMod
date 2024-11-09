package com.exemplo.cidademod.compat.handlers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public interface VehicleModHandler {
    void spawnVehicle(Level world, VehicleType type, BlockPos pos);
    boolean canPlaceVehicle(Level world, BlockPos pos, VehicleType type);
    void registerVehicleTypes();
} 