package com.exemplo.cidademod.gui;

import com.exemplo.cidademod.config.CustomizationOption;
import com.exemplo.cidademod.config.ColorOption;
import com.exemplo.cidademod.config.PartOption;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public class VehicleCustomizationGui extends Screen {
    private final String vehicleId;
    private final List<CustomizationOption> options;
    
    public VehicleCustomizationGui(String vehicleId) {
        super(Component.literal("Customização de Veículo"));
        this.vehicleId = vehicleId;
        this.options = loadCustomizationOptions(vehicleId);
    }
    
    private List<CustomizationOption> loadCustomizationOptions(String vehicleId) {
        List<CustomizationOption> options = new ArrayList<>();
        
        // Opções de customização do MrCrayfish's Vehicle Mod
        options.add(new ColorOption("Cor Principal"));
        options.add(new ColorOption("Cor Secundária"));
        options.add(new PartOption("Rodas"));
        options.add(new PartOption("Adesivos"));
        options.add(new PartOption("Acessórios"));
        
        return options;
    }
} 