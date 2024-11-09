package com.exemplo.cidademod.building.special;

import com.exemplo.cidademod.compat.ModCompatRegistry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndustrialBuilder {
    private final Map<String, List<MachineSetup>> machineLayouts = new HashMap<>();
    
    public void addMachineZone(String modId, BlockPos pos, Direction facing) {
        MachineSetup setup = new MachineSetup(pos, facing);
        machineLayouts.computeIfAbsent(modId, k -> new ArrayList<>()).add(setup);
    }
    
    public void buildMachines(World world) {
        for (Map.Entry<String, List<MachineSetup>> entry : machineLayouts.entrySet()) {
            ModCompatRegistry.getTechHandler(entry.getKey())
                .placeMachines(world, entry.getValue());
        }
    }
    
    public static class MachineSetup {
        public final BlockPos pos;
        public final Direction facing;
        public Map<String, Object> configuration;
        
        public MachineSetup(BlockPos pos, Direction facing) {
            this.pos = pos;
            this.facing = facing;
        }
    }
} 