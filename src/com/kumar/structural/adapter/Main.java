package com.kumar.structural.adapter;

public class Main {
    public static void main(String[] args) {
//        AppleCharger charger = new ChargeXYZ(); not available iphone charge
        AndroidCharger androidCharger = new AmbraneCharger();

        final AdapterCharger charger = new AdapterCharger(androidCharger);

        final Iphone15 iphone15 = new Iphone15(charger);
        iphone15.chargeIphone();
    }
}
