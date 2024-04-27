package com.kumar.creational.shallowcopy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        final NetworkConnection networkConnection = new NetworkConnection();
//
//        networkConnection.setIp("192.168.4.4");
//        networkConnection.loadVeryImportData();
//
//        System.out.println(networkConnection);

        // we want new object of network connection
        //shallow copy means reference of object
        final NetworkConnection networkConnection1 = new NetworkConnection();
        networkConnection1.setIp("192.168.4.4");
        networkConnection1.loadVeryImportData();

        // reflect to other object
        final NetworkConnection networkConnection2 = networkConnection1.clone();
        final NetworkConnection networkConnection3 = networkConnection1.clone();

        System.out.println(networkConnection1);

        networkConnection1.getDomains().remove(0);

        System.out.println(networkConnection2);
        System.out.println(networkConnection3);
    }
}
