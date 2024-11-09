package com.exemplo.cidademod.gui;

import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ScrollableList extends AbstractWidget {
    private final List<?> items;
    private int scrollOffset = 0;
    private int selectedIndex = -1;

    public ScrollableList(int x, int y, int width, int height, List<?> items) {
        super(x, y, width, height, Component.empty());
        this.items = items;
    }

    @Override
    public void updateNarration(NarrationElementOutput narrationElementOutput) {
        // Implementação básica
    }

    public Object getSelectedItem() {
        return selectedIndex >= 0 && selectedIndex < items.size() ? items.get(selectedIndex) : null;
    }
} 