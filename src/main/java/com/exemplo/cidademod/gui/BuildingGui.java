package com.exemplo.cidademod.gui;

import com.exemplo.cidademod.building.BuildingSystem;
import com.exemplo.cidademod.building.BuildingTemplate;
import com.exemplo.cidademod.mode.BuildingMode;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class BuildingGui extends Screen {
    private final List<BuildingTemplate> availableBuildings;
    private int selected = -1;
    
    public BuildingGui() {
        super(ITextComponent.literal("Construção"));
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
                ITextComponent.literal(template.getName()), button -> {
                    selected = index;
                    minecraft.setScreen(null);
                    // Inicia modo de construção
                    BuildingMode.start(template);
                }));
            
            y += 25;
        }
    }
} 