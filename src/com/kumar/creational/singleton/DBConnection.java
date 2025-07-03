package com.kumar.creational.singleton;

// Eager initialization
public class DBConnection {

    private static SingletonTest conObject = new SingletonTest(); // static means class load at time initialize

    private DBConnection(){} // constructor

    static SingletonTest getInstance(){ // static method used static  variable
        return conObject;
    }
}
