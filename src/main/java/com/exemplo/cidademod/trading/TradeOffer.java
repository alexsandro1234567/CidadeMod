package com.exemplo.cidademod.trading;

import net.minecraft.world.item.Item;

public class TradeOffer {
    private final Item inputItem;
    private final int inputAmount;
    private final Item outputItem;
    private final int outputAmount;

    public TradeOffer(Item inputItem, int inputAmount, Item outputItem, int outputAmount) {
        this.inputItem = inputItem;
        this.inputAmount = inputAmount;
        this.outputItem = outputItem;
        this.outputAmount = outputAmount;
    }

    public Item getInputItem() {
        return inputItem;
    }

    public int getInputAmount() {
        return inputAmount;
    }

    public Item getOutputItem() {
        return outputItem;
    }

    public int getOutputAmount() {
        return outputAmount;
    }
} 