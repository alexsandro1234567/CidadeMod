package com.exemplo.cidademod.building;

import com.exemplo.cidademod.gui.BuildingSelectionGui;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.block.BlockState;

public class BuildingWand extends Item {
    public BuildingWand(Properties props) {
        super(props);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        if (context.getWorld().isClientSide()) {
            // Abre GUI de seleção de construção
            context.getPlayer().openScreen(new BuildingSelectionGui());
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.CONSUME;
    }
} 