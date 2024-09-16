package com.kumar.adapter.weightmachine.client;

import com.kumar.adapter.weightmachine.adaptee.WeightMachineForBabies;
import com.kumar.adapter.weightmachine.adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        final WeightMachineAdapterImpl weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
