package com.kumar.creational.ExampleAbstractFactory.os.mac;

import com.kumar.creational.ExampleAbstractFactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
