package com.exemplo.cidademod.entity;

import com.exemplo.cidademod.CidadeMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = 
        DeferredRegister.create(ForgeRegistries.ENTITIES, CidadeMod.MOD_ID);
} 