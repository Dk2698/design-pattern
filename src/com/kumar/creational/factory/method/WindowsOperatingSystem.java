package com.kumar.creational.factory.method;

/**
 * The WindowsOperatingSystem class implements the OperatingSystem interface
 * for Windows operating systems.
 */
public class WindowsOperatingSystem extends OperatingSystem {

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        // Windows command to change directory
        System.out.println("Changing directory to: " + dir + " on Windows");
    }

    @Override
    public void removeDir(String dir) {
        // Windows command to remove directory
        System.out.println("Removing directory: " + dir + " on Windows");
    }
}