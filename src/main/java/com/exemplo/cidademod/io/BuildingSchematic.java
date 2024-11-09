package com.exemplo.cidademod.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.CompressedStreamTools;

import com.exemplo.cidademod.building.Building;

public class BuildingSchematic {
    public static void exportBuilding(Building building, String name) {
        // Salva construção como esquemática
        NBTTagCompound nbt = new NBTTagCompound();
        building.saveToNBT(nbt);
        
        // Salva em arquivo
        File schematicsDir = new File("schematics");
        schematicsDir.mkdir();
        
        try (FileOutputStream fos = new FileOutputStream(
            new File(schematicsDir, name + ".nbt"))) {
            CompressedStreamTools.writeCompressed(nbt, fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Building importBuilding(String name) {
        // Carrega esquemática do arquivo
        try (FileInputStream fis = new FileInputStream(
            new File("schematics", name + ".nbt"))) {
            NBTTagCompound nbt = CompressedStreamTools.readCompressed(fis);
            return Building.loadFromNBT(nbt);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
} 