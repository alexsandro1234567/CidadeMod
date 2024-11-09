package com.exemplo.cidademod.entity.ai;

public enum Activity {
    IDLE,
    WORKING,
    WALKING,
    TRADING,
    RESTING;

    private final String name;

    Activity() {
        this.name = this.name().toLowerCase();
    }

    public String getName() {
        return name;
    }
} 