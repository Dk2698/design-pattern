package com.kumar.creational.ExampleAbstractFactory;

import com.kumar.creational.ExampleAbstractFactory.uiFactory.MacUIFactory;
import com.kumar.creational.ExampleAbstractFactory.uiFactory.WinUIFactory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new WinUIFactory());
        application.paint();

        Application application1 = new Application(new MacUIFactory());
        application1.paint();
    }
}
