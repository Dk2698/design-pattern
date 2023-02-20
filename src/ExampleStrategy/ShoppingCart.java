package ExampleStrategy;

import ExampleStrategy.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // list of items
    List<Item> itemList;
    public  ShoppingCart(){
        this.itemList = new ArrayList<>();
    }
    public  void  addItem(Item item){
        this.itemList.add(item);
    }
    public  void  removeItem(Item item){
        this.itemList.remove(item);
    }

    public  int calculateTotal(){
        int sum = 0;
        for (Item item:itemList
             ) {
            sum += item.getPrice();
        }
        return  sum;
    }
    //payment method of shopping cart requires payment algorithm as argument and
    // doesn’t store it anywhere as instance variable.
    public void clickForPay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
