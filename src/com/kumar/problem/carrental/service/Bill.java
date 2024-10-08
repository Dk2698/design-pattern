package com.kumar.problem.carrental.service;

public class Bill {

    private Reservation reservation;
    private double totalBillAmount;
    private Boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount() {
        return 100.0;
    }

}
