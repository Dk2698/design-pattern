package com.kumar.ExampleAbstractFactory.uiFactory;

import com.kumar.ExampleAbstractFactory.Button;
import com.kumar.ExampleAbstractFactory.CheckBox;
import com.kumar.ExampleAbstractFactory.os.mac.MacButton;
import com.kumar.ExampleAbstractFactory.os.mac.MacCheckBox;

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
