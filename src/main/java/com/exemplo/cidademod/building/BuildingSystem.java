package com.exemplo.cidademod.building;

import java.util.HashMap;
import java.util.Map;

public class BuildingSystem {
    private static final Map<String, BuildingTemplate> TEMPLATES = new HashMap<>();
    
    public static void registerTemplate(String id, BuildingTemplate template) {
        TEMPLATES.put(id, template);
    }
    
    public static BuildingTemplate getTemplate(String id) {
        return TEMPLATES.get(id);
    }
    
    public static void init() {
        // Registra templates padrão
        registerTemplate("casa_pequena", new BuildingTemplate("casa_pequena", "structures/casa_pequena.nbt"));
        registerTemplate("loja", new BuildingTemplate("loja", "structures/loja.nbt"));
        registerTemplate("igreja", new BuildingTemplate("igreja", "structures/igreja.nbt"));
        registerTemplate("taverna", new BuildingTemplate("taverna", "structures/taverna.nbt"));
        registerTemplate("fazenda", new BuildingTemplate("fazenda", "structures/fazenda.nbt"));
    }
} 