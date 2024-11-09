package com.exemplo.cidademod.events;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

public class VehicleEvents {
    private final List<SpecialEvent> activeEvents = new ArrayList<>();
    
    public class SpecialEvent {
        private final String name;
        private final EventType type;
        private final List<Requirement> requirements = new ArrayList<>();
        private final List<Reward> rewards = new ArrayList<>();
        
        public boolean canPlayerParticipate(Player player) {
            return requirements.stream().allMatch(r -> r.check(player));
        }
        
        public void giveRewards(Player player) {
            rewards.forEach(r -> r.give(player));
        }
    }
    
    public enum EventType {
        RACE_TOURNAMENT,
        STUNT_SHOW,
        CAR_MEET,
        EMERGENCY_DRILL,
        POLICE_CHASE
    }
} 