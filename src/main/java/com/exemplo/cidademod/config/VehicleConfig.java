package com.exemplo.cidademod.config;

import java.util.HashMap;
import java.util.Map;

public class VehicleConfig {
    public static class VehicleEntry {
        public final String modId;
        public final String vehicleId;
        public final int width;
        public final int length;
        public final int height;
        public final boolean needsFuel;
        public final boolean canBeCustomized;
    }

    private static final Map<String, VehicleEntry> VEHICLE_REGISTRY = new HashMap<>();

    public static void registerMrCrayfishVehicles() {
        registerVehicle("vehicle:sports_car", 2, 4, 2, true, true);
        registerVehicle("vehicle:atv", 1, 2, 1, true, true);
        registerVehicle("vehicle:dirt_bike", 1, 2, 2, true, true);
        registerVehicle("vehicle:golf_cart", 2, 3, 2, true, false);
        registerVehicle("vehicle:jet_ski", 1, 3, 1, true, true);
        // Adicione mais veículos aqui
    }
} 