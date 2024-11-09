package com.exemplo.cidademod.building.garage;

import net.minecraft.core.BlockPos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehicleGarage {
    public enum GarageType {
        SMALL_GARAGE(2, 3, 6),
        MEDIUM_GARAGE(4, 3, 8),
        LARGE_GARAGE(6, 4, 12),
        SHOWROOM(8, 4, 16),
        SERVICE_STATION(4, 4, 10);

        private final int width;
        private final int height;
        private final int length;

        GarageType(int width, int height, int length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }
    }

    private final GarageType type;
    private final Map<BlockPos, VehicleSpot> parkingSpots = new HashMap<>();
    private final List<ServiceArea> serviceAreas = new ArrayList<>();

    public void addVehicleDisplay(BlockPos pos, String vehicleId) {
        VehicleSpot spot = new VehicleSpot(pos);
        spot.setDisplayVehicle(vehicleId);
        parkingSpots.put(pos, spot);
    }

    public void addServiceArea(BlockPos pos) {
        serviceAreas.add(new ServiceArea(pos));
    }
} 