package com.kumar.problem.carrental.model;

public class Location {

    private String address;
    private int pincode;
    private String city;
    private String state;
    private String country;

    public Location(String address, int pincode, String city, String state, String country) {
        this.address = address;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
