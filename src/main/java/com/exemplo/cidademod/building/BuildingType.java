package com.exemplo.cidademod.building;

public enum BuildingType {
    HOUSE("Casa", 3, 5, 4),
    SHOP("Loja", 5, 4, 5),
    OFFICE("Escritório", 8, 12, 8),
    GARAGE("Garagem", 6, 4, 8),
    FACTORY("Fábrica", 12, 8, 16),
    HOSPITAL("Hospital", 16, 12, 20),
    POLICE_STATION("Delegacia", 10, 8, 12),
    FIRE_STATION("Corpo de Bombeiros", 12, 8, 14);

    private final String displayName;
    private final int width;
    private final int height;
    private final int length;

    BuildingType(String displayName, int width, int height, int length) {
        this.displayName = displayName;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
} 