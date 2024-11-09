package com.exemplo.cidademod.compat;

import com.exemplo.cidademod.building.Building;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureCompat {
    private static final Map<String, List<Block>> FURNITURE_REGISTRY = new HashMap<>();
    
    public static void detectFurnitureMods() {
        // Detecta mods populares de mobília
        if (ModList.get().isLoaded("mrcrayfish_furniture")) {
            registerMrCrayfishFurniture();
        }
        if (ModList.get().isLoaded("bibliocraft")) {
            registerBibliocraft();
        }
    }
    
    public static void addFurnitureToBuilding(Building building, String roomType) {
        List<Block> furniture = FURNITURE_REGISTRY.get(roomType);
        if (furniture != null) {
            // Adiciona mobília apropriada para o tipo de sala
        }
    }
} 