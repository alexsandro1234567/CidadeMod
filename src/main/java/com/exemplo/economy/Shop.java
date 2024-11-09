package com.exemplo.cidademod.economy;

import net.minecraft.item.Item;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final Map<Item, Double> prices = new HashMap<>();
    private final String name;
    private double money;

    public Shop(String name) {
        this.name = name;
        this.money = 1000.0; // Dinheiro inicial
    }

    public void setPrice(Item item, double price) {
        prices.put(item, price);
    }

    public double getPrice(Item item) {
        return prices.getOrDefault(item, 0.0);
    }
} 