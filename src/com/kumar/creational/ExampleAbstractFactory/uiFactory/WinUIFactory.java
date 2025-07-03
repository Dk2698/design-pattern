package com.kumar.creational.ExampleAbstractFactory.uiFactory;

import com.kumar.creational.ExampleAbstractFactory.Button;
import com.kumar.creational.ExampleAbstractFactory.CheckBox;
import com.kumar.creational.ExampleAbstractFactory.os.win.WinButton;
import com.kumar.creational.ExampleAbstractFactory.os.win.WinCheckBox;

public class WinUIFactory implements  UIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
