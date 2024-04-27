package com.kumar.ExampleAbstractFactory.os.mac;

import com.kumar.ExampleAbstractFactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
