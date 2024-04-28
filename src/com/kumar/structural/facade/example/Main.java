package com.kumar.structural.facade.example;

public class Main {
    public static void main(String[] args) {
        final OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
