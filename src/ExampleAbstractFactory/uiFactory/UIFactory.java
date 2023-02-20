package ExampleAbstractFactory.uiFactory;

import ExampleAbstractFactory.Button;
import ExampleAbstractFactory.CheckBox;

public interface UIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
