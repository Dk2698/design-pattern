package com.kumar.ExampleAbstractFactory.os.win;

import com.kumar.ExampleAbstractFactory.Button;

public class WinButton  implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
