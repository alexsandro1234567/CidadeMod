package com.exemplo.cidademod.building.garage;

import net.minecraft.core.BlockPos;
import com.exemplo.cidademod.vehicle.VehicleType;

public class VehicleSpot {
    private final VehicleType type;
    private final BlockPos position;
    private String displayVehicleId;

    public VehicleSpot(VehicleType type, BlockPos pos) {
        this.type = type;
        this.position = pos;
    }

    public void setDisplayVehicle(String vehicleId) {
        this.displayVehicleId = vehicleId;
    }
} 