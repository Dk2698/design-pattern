package com.kumar.creational.ExampleAbstractFactory.uiFactory;

import com.kumar.creational.ExampleAbstractFactory.Button;
import com.kumar.creational.ExampleAbstractFactory.CheckBox;
import com.kumar.creational.ExampleAbstractFactory.os.mac.MacButton;
import com.kumar.creational.ExampleAbstractFactory.os.mac.MacCheckBox;

public class MacUIFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
