package ExampleStrategy;

import ExampleStrategy.strategy.CreditCardStrategy;
import ExampleStrategy.strategy.PaypalStrategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("12345678",100);
        Item item2 = new Item("123456789",400);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.clickForPay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.clickForPay(new CreditCardStrategy("Kumar", "1234567898765",
                "121", "12/30"));
    }
}
