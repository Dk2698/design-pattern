package com.kumar.builder.url;

public class Wardrobe {
    private int doors;
    private boolean isMirror;
    private boolean isWheels;
    private boolean isHangingRod;
    private int compartments;

    public Wardrobe(int doors) {
        this.doors = doors;
    }

    public Wardrobe(int doors, boolean isMirror) {
        this.doors = doors;
        this.isMirror = isMirror;
    }

    public Wardrobe(int doors, boolean isMirror, boolean isWheels) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.isWheels = isWheels;
    }

    public Wardrobe(int doors, boolean isMirror, boolean isWheels, boolean isHangingRod) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.isWheels = isWheels;
        this.isHangingRod = isHangingRod;
    }

    public Wardrobe(int doors, boolean isMirror, boolean isWheels, boolean isHangingRod, int compartments) {
        this.doors = doors;
        this.isMirror = isMirror;
        this.isWheels = isWheels;
        this.isHangingRod = isHangingRod;
        this.compartments = compartments;
    }
}
// problem _. how can we create wardrobe with doors , mirror, and compartments
// 1) create  constructor for these fields
// 2) some field passing null  value  at object created time
// think about permutation and combination
