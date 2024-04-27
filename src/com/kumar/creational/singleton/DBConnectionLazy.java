package com.kumar.creational.singleton;

import java.io.Serializable;

// Eager initialization
public class DBConnectionLazy implements Serializable , Cloneable{

    private static DBConnectionLazy conObject; // static means class load at time initialize

    private DBConnectionLazy() {// constructor
        if (conObject != null){
            throw  new RuntimeException("You are trying to break singleton pattern");
        }
    }

    // lazy way of creating single object
    static DBConnectionLazy getInstance() { // static method used static  variable
        if (conObject == null) {
            // object of this class
            conObject = new DBConnectionLazy();
        }
        return conObject;
    }

    // synchronized means lock
    static synchronized DBConnectionLazy getInstance1() { // static method used static  variable
        if (conObject == null) {
            conObject = new DBConnectionLazy();
        }
        return conObject;
    }

    // double lock

    static DBConnectionLazy getInstance3() { // static method used static  variable
        if (conObject == null) {
            synchronized (DBConnectionLazy.class) {
                if (conObject == null) {
                    conObject = new DBConnectionLazy();
                }
            }
        }
        return conObject;
    }

    public Object readResolve(){
        return conObject;
    }

    @Override
    public DBConnectionLazy clone() {
        //            DBConnectionLazy clone = (DBConnectionLazy) super.clone();
        // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
        return conObject;
    }
}
