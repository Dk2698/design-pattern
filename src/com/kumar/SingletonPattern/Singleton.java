package com.kumar.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// example db connection
// only one object create also use many places
// constructor time create new object-> to make private
// static field to create once and also use static method return same object
class Singleton {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // how to work singleton
        exampleSerialization();
        //one of way to break singleton
        // convert object into byte form and send over network with file
        // exampleSerialization1();
        exampleReflection();
    }

    private static void exampleSerialization() throws FileNotFoundException, IOException, ClassNotFoundException {
        // get the object of class
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        // read object
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Object 1 :" + lazySingleton.hashCode());
        System.out.println("Object 2 :" + deserializedLazy.hashCode());
        // how to handle to
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();

        // read object
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println(" serializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println(" serializableSingleton Object 2 :" + deserializedInstance.hashCode());
    }
    private static void exampleSerialization1() throws FileNotFoundException, IOException, ClassNotFoundException {
        // get the obejct of class
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("object1.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();

        // read object
        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("object1.obj"));
        SerializableSingleton deserializedInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println(" serializableSingleton Object 1 :" + serializableSingleton.hashCode());
        System.out.println(" serializableSingleton Object 2 :" + deserializedInstance.hashCode());
        // how to handle to this problem
        // solution to this is go by enum
        EnumSingleton.INSTANCE.doSomething();
    }

    // reflection
    private static void exampleReflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        //knowing only constructor taking it using index
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);// change priavte to public
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(" Reflected hashcode  Singleton :" + lazySingleton.hashCode());
        System.out.println(" Singleton instance :" + instance.hashCode());
    }
}

class LazySingleton implements Serializable {
    // static field this use in static method
    private static LazySingleton instance = null;

    // private, no one to create object of class via constructor
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance; // always return same object at calling this method
    }
}

// multithreading -> two thread are create new object of singleton class
// EagerSingleton Solved
class EagerSingleton {
    // jvm this class load at time create object, when thread are used they only
    // one instance
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
// issue -> if are not use object, but store in memory

// multiThread
// synchronized method only one time call to access thread
class MultiThreadSingleton {
    // jvm this class load at time create object, when thread are used they onely
    // one instance
    private static MultiThreadSingleton instance = null;

    private MultiThreadSingleton() {

    }

    public static MultiThreadSingleton getInstance() {
        if (instance == null) {
            // Our method is static, so we have class level locking here
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}

// how to break singleton
class SerializableSingleton implements Serializable {
    // static field this use in static method
    private static SerializableSingleton instance = null;

    // private, no one to create object of class via sonstrcuor
    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance; // always return same object at calling this method
    }

    //this  method at   deserialized time, jvm call itself
    protected Object readResolve(){
        return instance;
    }
}

