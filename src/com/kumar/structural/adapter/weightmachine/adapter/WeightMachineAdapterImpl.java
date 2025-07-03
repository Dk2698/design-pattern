package com.kumar.structural.adapter.weightmachine.adapter;

import com.kumar.structural.adapter.weightmachine.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    // client call weightMachineAdapter and return weight in kg
    @Override
    public double getWeightInKg() {
        final double weightPound = weightMachine.getWeightPound();
        return weightPound * .45;
    }
}
