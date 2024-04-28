package com.kumar.structural.bridge;

public class Fish extends LivingThings{


    protected Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breathe();
    }
}
