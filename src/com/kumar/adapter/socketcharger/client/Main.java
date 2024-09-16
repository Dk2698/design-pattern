package com.kumar.adapter.socketcharger.client;

import com.kumar.adapter.socketcharger.adapter.AdapterCharger;
import com.kumar.adapter.socketcharger.adaptee.AmbraneCharger;
import com.kumar.adapter.socketcharger.adaptee.AndroidCharger;
import com.kumar.adapter.socketcharger.adapter.Iphone15;

public class Main {
    public static void main(String[] args) {
//        AppleCharger charger = new ChargeXYZ(); not available iphone charge
        AndroidCharger androidCharger = new AmbraneCharger();

        final AdapterCharger charger = new AdapterCharger(androidCharger);

        final Iphone15 iphone15 = new Iphone15(charger);
        iphone15.chargeIphone();
    }
}
