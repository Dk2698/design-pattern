package com.kumar.structural.bridge;

public abstract class LivingThings {

    protected final BreatheImplementor breatheImplementor;

    protected LivingThings(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract void breatheProcess();
}
