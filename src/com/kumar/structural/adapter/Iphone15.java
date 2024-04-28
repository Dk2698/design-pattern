package com.kumar.structural.adapter;

public class Iphone15 {

    private final AppleCharger appleCharger;

    public Iphone15(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }


    public void chargeIphone(){
        appleCharger.chargePhone();
    }
}
