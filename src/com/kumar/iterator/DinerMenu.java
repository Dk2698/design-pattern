package com.kumar.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 6;

    int numberOfItems = 0;

    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "potato salad", false, 3.49);
        addItem("HotDog", "onions, topped with cheese", false, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, manu is full !, can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public Iterator<MenuItem> createIterators() {
        return Arrays.stream(menuItems).iterator();
    }
}
