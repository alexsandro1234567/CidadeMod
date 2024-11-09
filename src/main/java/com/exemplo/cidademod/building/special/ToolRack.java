package com.exemplo.cidademod.building.special;

import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import java.util.ArrayList;
import java.util.List;

public class ToolRack {
    private final BlockPos position;
    private final List<Item> tools;
    private final int maxTools;

    public ToolRack(BlockPos position, int maxTools) {
        this.position = position;
        this.maxTools = maxTools;
        this.tools = new ArrayList<>();
    }

    public boolean addTool(Item tool) {
        if (tools.size() < maxTools) {
            tools.add(tool);
            return true;
        }
        return false;
    }

    public Item removeTool() {
        if (!tools.isEmpty()) {
            return tools.remove(tools.size() - 1);
        }
        return null;
    }

    public BlockPos getPosition() {
        return position;
    }

    public List<Item> getTools() {
        return new ArrayList<>(tools); // retorna uma cópia da lista
    }

    public boolean isFull() {
        return tools.size() >= maxTools;
    }

    public boolean isEmpty() {
        return tools.isEmpty();
    }

    public void render(World world) {
        // Aqui você pode adicionar lógica para renderizar o rack
        // Por exemplo, colocar blocos ou partículas para representar as ferramentas
    }
} 