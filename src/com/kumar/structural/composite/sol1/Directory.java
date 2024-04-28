package com.kumar.structural.composite.sol1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private final String directoryName;

    List<FileSystem> objectList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        objectList = new ArrayList<>();
    }

    public void add(FileSystem object){
        objectList.add(object);
    }

    public void ls(){
        System.out.println("Directory Name : "+ directoryName);

        for (Object obj : objectList) {
            if (obj instanceof  File){
                ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
}
