package ExampleAbstractFactory.uiFactory;

import ExampleAbstractFactory.Button;
import ExampleAbstractFactory.CheckBox;
import ExampleAbstractFactory.os.win.WinButton;
import ExampleAbstractFactory.os.win.WinCheckBox;

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
