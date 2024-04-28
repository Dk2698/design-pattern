package com.kumar.structural.bridge;

public class Main {
    public static void main(String[] args) {
        final Fish fish = new Fish(new WaterBreatheImplementation());
        fish.breatheProcess();
    }
}
