package com.exemplo.cidademod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.entity.ai.goal.FloatGoal;
import net.minecraft.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;

public class CidadeNPC extends CreatureEntity {
    public CidadeNPC(EntityType<? extends CreatureEntity> type, World world) {
        super(type, world);
    }
    
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
    }
    
    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false; // NPCs não desaparecem
    }
} 