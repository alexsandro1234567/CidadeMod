package com.exemplo.cidademod.gui;

public enum BuildingCategory {
    RESIDENTIAL("Residencial"),
    COMMERCIAL("Comercial"),
    INDUSTRIAL("Industrial"),
    PUBLIC("Público"),
    SPECIAL("Especial");

    private final String displayName;

    BuildingCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
} 