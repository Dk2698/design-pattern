package ExampleAbstractFactory.os.mac;

import ExampleAbstractFactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
