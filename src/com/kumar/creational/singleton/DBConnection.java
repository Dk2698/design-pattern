package com.kumar.creational.singleton;

// Eager initialization
public class DBConnection {

    private static  DBConnection conObject = new DBConnection(); // static means class load at time initialize

    private DBConnection(){} // constructor

    static DBConnection getInstance(){ // static method used static  variable
        return conObject;
    }
}
