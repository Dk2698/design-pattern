package com.kumar.structural.composite.sol1;

public class File implements FileSystem{
    private final  String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void ls(){
        System.out.println("file name : "+ fileName);
    }
}
