package com.kumar.creational.ExampleAbstractFactory.os.win;

import com.kumar.creational.ExampleAbstractFactory.CheckBox;

public class WinCheckBox  implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win CheckBox");
    }
}
