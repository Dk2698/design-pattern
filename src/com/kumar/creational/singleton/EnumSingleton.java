package com.kumar.creational.singleton;
// create to enum because solved by reflection of constructor
public  enum EnumSingleton {
    INSTANCE;
    public  void doSomething(){
            System.out.println("cool");
    }
}