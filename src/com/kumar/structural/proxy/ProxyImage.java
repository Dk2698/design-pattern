package com.kumar.structural.proxy;


// Proxy  is-a Image
// Proxy  has-a RealImage

public class ProxyImage implements Image {
    private RealImage realImage; // refer to original object and client interacts with proxy
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}