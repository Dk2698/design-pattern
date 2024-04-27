package ExampleAbstractFactory.os.win;

import ExampleAbstractFactory.Button;

public class WinButton  implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
