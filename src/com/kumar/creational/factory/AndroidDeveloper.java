package com.kumar.creational.factory;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("getting Android developer salary..");
        return 50000;
    }
}
