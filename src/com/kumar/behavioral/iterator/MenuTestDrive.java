package com.kumar.behavioral.iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        final PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
//        for (MenuItem menuItem : pancakeHouseMenu.getMenuItems()) {
//            System.out.println(menuItem.getName()+ " ");
//            System.out.println(menuItem.getPrice()+ " ");
//            System.out.println(menuItem.getDescription());
//        }
//
//        final DinerMenu dinerMenu = new DinerMenu();
//        final MenuItem[] lunchitems = dinerMenu.getMenuItems();
//        for (int i = 0; i < lunchitems.length; i++) {
//            final MenuItem lunchtime = lunchitems[i];
//            System.out.println(lunchtime.getName()+ " ");
//            System.out.println(lunchtime.getPrice()+ " ");
//            System.out.println(lunchtime.getDescription());
//        }
//
//        final DinerMenu dinerMenu1  = new DinerMenu();
//        Iterator iterator = dinerMenu1.createIterator();
//
//        while (iterator.hasNext()){
//            final  MenuItem menuItem = (MenuItem) iterator.next();
//            System.out.println(menuItem.getName());
//        }


        final Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }
}
