package com.kumar.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", true, 2.99);
        addItem("BlueBerry Pancake Breakfast", "Pancake  made with fresh blueberries", true, 3.49);
        addItem("Waffles Pancake Breakfast", "Waffles with your choice of blueberries or strawberries", true, 3.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    public Iterator<MenuItem> createIterators() {
        return menuItems.iterator();
    }
}
