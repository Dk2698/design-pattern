package com.kumar.ExampleAbstractFactory.uiFactory;

import com.kumar.ExampleAbstractFactory.Button;
import com.kumar.ExampleAbstractFactory.CheckBox;

public interface UIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
