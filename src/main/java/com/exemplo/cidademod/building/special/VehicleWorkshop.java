package com.exemplo.cidademod.building.special;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class VehicleWorkshop {
    private final List<RepairBay> repairBays = new ArrayList<>();
    private final List<ToolRack> toolRacks = new ArrayList<>();
    private final Map<String, Integer> partInventory = new HashMap<>();

    public void addRepairBay(BlockPos pos) {
        repairBays.add(new RepairBay(pos));
    }

    public void addToolRack(BlockPos pos) {
        toolRacks.add(new ToolRack(pos, 4)); // 4 ferramentas por rack
    }

    public ToolRack getClosestToolRack(BlockPos pos) {
        if (toolRacks.isEmpty()) return null;
        
        ToolRack closest = toolRacks.get(0);
        double closestDist = pos.distanceSq(closest.getPosition());
        
        for (ToolRack rack : toolRacks) {
            double dist = pos.distanceSq(rack.getPosition());
            if (dist < closestDist) {
                closest = rack;
                closestDist = dist;
            }
        }
        
        return closest;
    }

    public void repairVehicle(String vehicleId, BlockPos bayPos) {
        Entity vehicle = findVehicle(vehicleId);
        if (vehicle != null && hasRequiredParts(vehicle)) {
            // Lógica de reparo
            vehicle.repair();
            consumeParts(vehicle.getRequiredParts());
        }
    }

    private static class RepairBay {
        private final BlockPos pos;
        private boolean occupied;
        private String currentVehicle;

        public RepairBay(BlockPos pos) {
            this.pos = pos;
        }
    }
} 