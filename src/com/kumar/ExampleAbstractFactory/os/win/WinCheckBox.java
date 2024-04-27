package com.kumar.ExampleAbstractFactory.os.win;

import com.kumar.ExampleAbstractFactory.CheckBox;

public class WinCheckBox  implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win CheckBox");
    }
}
