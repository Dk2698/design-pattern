package ExampleAbstractFactory.uiFactory;

import ExampleAbstractFactory.Button;
import ExampleAbstractFactory.CheckBox;
import ExampleAbstractFactory.os.mac.MacButton;
import ExampleAbstractFactory.os.mac.MacCheckBox;

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
