package com.kumar.structural.adapter.socketcharger.adapter;

public class ChargeXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("your Iphone is charging");
    }
}
