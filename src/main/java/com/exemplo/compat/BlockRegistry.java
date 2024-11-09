package com.exemplo.cidademod.compat;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import java.util.HashMap;
import java.util.Map;

public class BlockRegistry {
    private static final Map<String, Block> PRIMARY_BLOCKS = new HashMap<>();
    private static final Map<String, Block[]> ALTERNATIVE_BLOCKS = new HashMap<>();

    public static void init() {
        // Registra blocos primários
        registerPrimary("parede", Blocks.STONE_BRICKS);
        registerPrimary("piso", Blocks.OAK_PLANKS);
        registerPrimary("telhado", Blocks.TERRACOTTA);

        // Registra alternativas
        registerAlternative("parede", Blocks.STONE_BRICKS, Blocks.BRICKS);
        registerAlternative("piso", Blocks.OAK_PLANKS, Blocks.STONE);
        registerAlternative("telhado", Blocks.TERRACOTTA, Blocks.BRICKS);
    }

    public static void registerPrimary(String key, Block block) {
        PRIMARY_BLOCKS.put(key, block);
    }

    public static void registerAlternative(String key, Block... blocks) {
        ALTERNATIVE_BLOCKS.put(key, blocks);
    }
} 