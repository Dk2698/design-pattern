package ExampleAbstractFactory.os.mac;

import ExampleAbstractFactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
