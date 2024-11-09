package com.exemplo.cidademod.building.special;

import com.exemplo.cidademod.compat.ModCompatRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class GarageBuilder {
    private final int width;
    private final int height;
    private final int depth;
    private final List<VehicleSpot> parkingSpots = new ArrayList<>();
    
    public void addVehicleSpot(VehicleType type, BlockPos pos) {
        parkingSpots.add(new VehicleSpot(type, pos));
    }
    
    public void spawnVehicle(Level world, VehicleType type, BlockPos pos) {
        ModCompatRegistry.getVehicleHandler(type.getMod()).spawnVehicle(world, type, pos);
    }
    
    public enum VehicleType {
        CAR("car", 2, 2, 3),
        TRUCK("car", 2, 3, 4),
        HELICOPTER("vehicle", 4, 3, 4),
        MOTORCYCLE("car", 1, 2, 2);
        
        private final String mod;
        private final int width;
        private final int height;
        private final int length;
        
        VehicleType(String mod, int width, int height, int length) {
            this.mod = mod;
            this.width = width;
            this.height = height;
            this.length = length;
        }
    }
} 