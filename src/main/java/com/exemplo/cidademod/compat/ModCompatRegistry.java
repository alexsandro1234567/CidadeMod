package com.exemplo.cidademod.compat;

import java.util.HashMap;
import java.util.Map;

public class ModCompatRegistry {
    private static final Map<String, ModCompatHandler> HANDLERS = new HashMap<>();
    
    // Registra diferentes tipos de compatibilidade
    public static void initializeCompat() {
        // Mods de Veículos
        if (ModList.get().isLoaded("car")) {
            registerVehicleCompat("car", new CarModCompat());
        }
        if (ModList.get().isLoaded("vehicle")) {
            registerVehicleCompat("vehicle", new MrCrayfishVehicleCompat());
        }
        
        // Mods de Máquinas/Tech
        if (ModList.get().isLoaded("mekanism")) {
            registerTechCompat("mekanism", new MekanismCompat());
        }
        if (ModList.get().isLoaded("immersiveengineering")) {
            registerTechCompat("immersiveengineering", new ImmersiveEngineeringCompat());
        }
        
        // Mods de Decoração
        if (ModList.get().isLoaded("mrcrayfish_furniture")) {
            registerFurnitureCompat("mrcrayfish_furniture", new CrayfishFurnitureCompat());
        }
        
        // Mods de Agricultura
        if (ModList.get().isLoaded("farmingforblockheads")) {
            registerFarmingCompat("farmingforblockheads", new FarmingCompat());
        }
    }
} 