package com.kumar.iterator;

import java.util.Iterator;

public class Waitress {
//    private PancakeHouseMenu pancakeHouseMenu;
//    private DinerMenu dinerMenu;
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
//        final Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        final Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        final Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("MENU\n ------\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            final MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
