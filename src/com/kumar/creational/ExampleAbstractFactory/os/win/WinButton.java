package com.kumar.creational.ExampleAbstractFactory.os.win;

import com.kumar.creational.ExampleAbstractFactory.Button;

public class WinButton  implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
