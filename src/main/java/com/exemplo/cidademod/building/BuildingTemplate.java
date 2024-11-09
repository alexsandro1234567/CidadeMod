package com.exemplo.cidademod.building;

public class BuildingTemplate {
    private final String id;
    private final String structurePath;

    public BuildingTemplate(String id, String structurePath) {
        this.id = id;
        this.structurePath = structurePath;
    }

    public String getId() {
        return id;
    }

    public String getStructurePath() {
        return structurePath;
    }
} 