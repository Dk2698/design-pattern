package com.kumar.ExampleAbstractFactory.os.mac;

import com.kumar.ExampleAbstractFactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
