package com.exemplo.cidademod.building;

import com.exemplo.cidademod.gui.BuildingSelectionGui;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.InteractionResult;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.state.BlockState;

public class BuildingWand extends Item {
    public BuildingWand(Properties props) {
        super(props);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) {
            // Abre GUI de seleção de construção
            Minecraft.getInstance().setScreen(new BuildingSelectionGui());
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.CONSUME;
    }
} 