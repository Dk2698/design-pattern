package com.kumar.creational.factory.method;

/**
 * The LinuxOperatingSystem class implements the OperatingSystem interface
 * for Linux operating systems.
 */
public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        // Linux command to change directory
        System.out.println("Changing directory to: " + dir + " on Linux");
    }

    @Override
    public void removeDir(String dir) {
        // Linux command to remove directory
        System.out.println("Removing directory: " + dir + " on Linux");
    }
}