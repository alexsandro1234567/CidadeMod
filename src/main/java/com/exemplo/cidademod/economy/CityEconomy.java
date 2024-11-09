package com.exemplo.cidademod.economy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CityEconomy {
    private final Map<UUID, Double> playerBalance = new HashMap<>();
    private final Map<BlockPos, Shop> shops = new HashMap<>();

    public void addMoney(Player player, double amount) {
        UUID playerId = player.getUUID();
        double currentBalance = playerBalance.getOrDefault(playerId, 0.0);
        playerBalance.put(playerId, currentBalance + amount);
    }

    public boolean removeMoney(Player player, double amount) {
        UUID playerId = player.getUUID();
        double currentBalance = playerBalance.getOrDefault(playerId, 0.0);
        if (currentBalance >= amount) {
            playerBalance.put(playerId, currentBalance - amount);
            return true;
        }
        return false;
    }

    public double getBalance(Player player) {
        return playerBalance.getOrDefault(player.getUUID(), 0.0);
    }
}