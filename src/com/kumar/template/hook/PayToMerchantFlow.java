package com.kumar.template.hook;

import com.kumar.template.method.PaymentFlow;

public class PayToMerchantFlow extends PaymentFlow {
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
