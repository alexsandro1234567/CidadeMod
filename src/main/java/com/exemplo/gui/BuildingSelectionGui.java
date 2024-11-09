package com.exemplo.cidademod.gui;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import java.util.Arrays;
import java.util.List;

public class BuildingSelectionGui extends Screen {
    private List<BuildingCategory> categories = Arrays.asList(BuildingCategory.values());
    private ScrollableList categoryList;
    private ScrollableList buildingList;
    private Button previewButton;
    private Button buildButton;

    public BuildingSelectionGui() {
        super(Component.literal("Seleção de Construção"));
    }

    @Override
    protected void init() {
        categoryList = new ScrollableList(10, 30, 100, 120, categories);
        buildingList = new ScrollableList(120, 30, 150, 120, Arrays.asList());
        
        previewButton = Button.builder(Component.literal("Visualizar"), button -> previewBuilding())
            .pos(10, height - 30)
            .size(100, 20)
            .build();
            
        buildButton = Button.builder(Component.literal("Construir"), button -> buildSelected())
            .pos(120, height - 30)
            .size(100, 20)
            .build();

        addRenderableWidget(categoryList);
        addRenderableWidget(buildingList);
        addRenderableWidget(previewButton);
        addRenderableWidget(buildButton);
    }

    private void previewBuilding() {
        // Implementação da visualização
    }

    private void buildSelected() {
        // Implementação da construção
    }
}