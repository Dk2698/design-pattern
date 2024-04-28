package com.kumar.structural.facade.example;

public class OrderFacade {
    ProductDAO productDAO;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OrderFacade() {
        this.productDAO = new ProductDAO();
        this.invoice = new Invoice();
        this.payment = new Payment();
        this.sendNotification = new SendNotification();
    }

    public void createOrder(){
        productDAO.getProduct(1);
        payment.makePayment();
        invoice.generatedInvoice();
        sendNotification.sendNotification();
    }
}
