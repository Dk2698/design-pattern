package com.kumar.behavioral.template.method;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of payToFriend");
    }

    @Override
    public void calculateFees() {

    }

    @Override
    public void debitAmount() {

    }

    @Override
    public void creditAmount() {

    }
}
