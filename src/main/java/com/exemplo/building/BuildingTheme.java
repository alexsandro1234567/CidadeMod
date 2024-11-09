package com.exemplo.cidademod.building;

import net.minecraft.world.level.block.Block;
import java.util.HashMap;
import java.util.Map;

public class BuildingTheme {
    private final Map<String, Block> blockMappings;
    private final String name;

    public BuildingTheme(String name) {
        this.name = name;
        this.blockMappings = new HashMap<>();
    }

    public void addBlockMapping(String key, Block block) {
        blockMappings.put(key, block);
    }

    public Block getBlock(String key) {
        return blockMappings.getOrDefault(key, null);
    }

    public String getName() {
        return name;
    }
} 