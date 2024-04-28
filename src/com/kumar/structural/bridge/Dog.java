package com.kumar.structural.bridge;

public class Dog extends LivingThings{
    protected Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breathe();
    }
}
