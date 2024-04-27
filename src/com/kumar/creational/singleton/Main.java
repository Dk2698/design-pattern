package com.kumar.creational.singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
//        DBConnection dbConnection = new DBConnection(); //  constructor
//        final DBConnection instance1 = DBConnection.getInstance();
//        System.out.println("hashcode : "+ instance1.hashCode());
//
//        final DBConnection instance2 = DBConnection.getInstance();
//        System.out.println("hashcode : "+ instance2.hashCode());

        /**
         * 1. Reflection API to break singleton pattern
         * sol -> if object is there than throw exception
         * sol -> enum
         * 2. Deserialization
         * sol -> implementing readResolve method
         * 3. cloning
         */


//        final DBConnectionLazy instance = DBConnectionLazy.getInstance();
//        System.out.println(instance.hashCode());

//        final Constructor<DBConnectionLazy> constructor = DBConnectionLazy.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        final DBConnectionLazy newInstance = constructor.newInstance();
//        System.out.println(newInstance.hashCode());

//        // enum
//        final DBConEnum dbConnection = DBConEnum.INSTANCE;
//        dbConnection.test();


//        final DBConnectionLazy instance = DBConnectionLazy.getInstance();
//        System.out.println(instance.hashCode());
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"))) {
//            objectOutputStream.writeObject(instance);
//        }
//        System.out.println("Serialization done...");
//
//
//        final DBConnectionLazy readObject;
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"))) {
//            readObject = (DBConnectionLazy) ois.readObject();
//        }
//        System.out.println(readObject.hashCode());


        final DBConnectionLazy instance = DBConnectionLazy.getInstance();
        System.out.println(instance.hashCode());

        final DBConnectionLazy clone = instance.clone();
        System.out.println(clone.hashCode());
    }
}
