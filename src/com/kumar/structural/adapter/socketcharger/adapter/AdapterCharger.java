package com.kumar.structural.adapter.socketcharger.adapter;


import com.kumar.structural.adapter.socketcharger.adaptee.AndroidCharger;

public class AdapterCharger implements AppleCharger{ // interface apple charge

    private final AndroidCharger charger; // taking android charge

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargePhone() {
        charger.chargeAndroidPhone();
        System.out.println("adapter");
    }
}
