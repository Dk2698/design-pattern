package com.kumar.adapter.socketcharger.adaptee;

public class AmbraneCharger implements AndroidCharger {
    @Override
    public void chargeAndroidPhone() {
        System.out.println("Android phone charge");
    }
}
