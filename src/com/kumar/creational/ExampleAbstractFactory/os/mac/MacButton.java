package com.kumar.creational.ExampleAbstractFactory.os.mac;

import com.kumar.creational.ExampleAbstractFactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
