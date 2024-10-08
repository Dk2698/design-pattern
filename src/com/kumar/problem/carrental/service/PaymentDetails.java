package com.kumar.problem.carrental.service;

import com.kumar.problem.carrental.enums.PaymentMode;

import java.util.Date;

public class PaymentDetails {

    private int paymentId;
    private int amountPaid;
    private Date dateOfPayment;
    private boolean isRefundable;
    private PaymentMode paymentMode;
}

