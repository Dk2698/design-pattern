package com.kumar.ExampleAbstractFactory.uiFactory;

import com.kumar.ExampleAbstractFactory.Button;
import com.kumar.ExampleAbstractFactory.CheckBox;
import com.kumar.ExampleAbstractFactory.os.win.WinButton;
import com.kumar.ExampleAbstractFactory.os.win.WinCheckBox;

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
