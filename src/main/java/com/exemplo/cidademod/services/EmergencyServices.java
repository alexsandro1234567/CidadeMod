package com.exemplo.cidademod.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.exemplo.cidademod.traffic.TrafficSystem;
import com.exemplo.cidademod.racing.RaceSystem;
import com.exemplo.cidademod.parking.AutomatedParking;
import com.exemplo.cidademod.rental.VehicleRental;
import com.exemplo.cidademod.events.VehicleEvents;

import net.minecraft.core.BlockPos;

public class EmergencyServices {
    // Tipos de Serviços de Emergência
    public enum ServiceType {
        POLICE(Arrays.asList(
            "police_car", "swat_van", "police_motorcycle"
        )),
        FIRE(Arrays.asList(
            "fire_truck", "ladder_truck", "rescue_vehicle"
        )),
        AMBULANCE(Arrays.asList(
            "ambulance", "medical_helicopter", "emergency_suv"
        ));

        private final List<String> vehicles;
        
        ServiceType(List<String> vehicles) {
            this.vehicles = vehicles;
        }
    }

    private final Map<ServiceType, EmergencyStation> stations = new HashMap<>();
    
    public void createStation(ServiceType type, BlockPos pos) {
        stations.put(type, new EmergencyStation(type, pos));
    }
    
    public void dispatchVehicle(ServiceType type, BlockPos target) {
        EmergencyStation station = stations.get(type);
        if (station != null) {
            station.dispatchNearest(target);
        }
    }
} 