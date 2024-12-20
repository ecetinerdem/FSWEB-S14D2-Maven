package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(LampType style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globalRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }

    public boolean isBattery() {
        return this.battery;
    }

    public LampType getStyle() {
        return this.style;
    }

    public int getGlobRating() {
        return this.globRating;
    }
}
