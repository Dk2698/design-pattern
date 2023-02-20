package ExampleAbstractFactory.os.win;

import ExampleAbstractFactory.CheckBox;

public class WinCheckBox  implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win CheckBox");
    }
}
