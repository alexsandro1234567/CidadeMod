package com.exemplo.cidademod.events;

import net.minecraft.world.entity.player.Player;

public interface Requirement {
    boolean isMet(Player player);
} 