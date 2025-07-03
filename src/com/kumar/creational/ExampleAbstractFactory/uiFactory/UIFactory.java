package com.kumar.creational.ExampleAbstractFactory.uiFactory;

import com.kumar.creational.ExampleAbstractFactory.Button;
import com.kumar.creational.ExampleAbstractFactory.CheckBox;

public interface UIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
