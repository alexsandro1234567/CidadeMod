package com.exemplo.cidademod.gui;

import com.exemplo.cidademod.building.BuildingSystem;
import com.exemplo.cidademod.building.BuildingTemplate;
import com.exemplo.cidademod.mode.BuildingMode;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BuildingGui extends Screen {
    private final List<BuildingTemplate> availableBuildings;
    private int selected = -1;
    
    public BuildingGui() {
        super(Component.literal("Construção"));
        this.availableBuildings = BuildingSystem.getAvailableTemplates();
    }
    
    @Override
    protected void init() {
        // Adiciona botões para cada tipo de construção
        int y = 20;
        for (int i = 0; i < availableBuildings.size(); i++) {
            BuildingTemplate template = availableBuildings.get(i);
            final int index = i;
            
            this.addRenderableWidget(new Button(width / 2 - 100, y, 200, 20,
                Component.literal(template.getName()), button -> {
                    selected = index;
                    minecraft.setScreen(null);
                    // Inicia modo de construção
                    BuildingMode.start(template);
                }));
            
            y += 25;
        }
    }
} 