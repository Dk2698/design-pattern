package com.kumar.factory.method;

/**
 * The TestDrive class demonstrates the use of the Factory Method Design Pattern
 * by creating instances of different Operating Systems.
 */
public class OperatingSystemTestDrive {
    public static void main(String[] args) {
        // Create a Windows operating system instance
        OperatingSystem windows = OperatingSystemFactory.getInstance("WINDOWS", "10", "x64");
        System.out.println("Operating System: Windows");
        System.out.println("Version: " + windows.getVersion());
        System.out.println("Architecture: " + windows.getArchitecture());
        windows.changeDir("C:\\Program Files");
        windows.removeDir("C:\\Temp");

        System.out.println();

        // Create a Linux operating system instance
        OperatingSystem linux = OperatingSystemFactory.getInstance("LINUX", "Ubuntu 20.04", "x64");
        System.out.println("Operating System: Linux");
        System.out.println("Version: " + linux.getVersion());
        System.out.println("Architecture: " + linux.getArchitecture());
        linux.changeDir("/usr/local");
        linux.removeDir("/tmp");

        System.out.println();

        // Uncommenting the following line will throw an exception
        // OperatingSystem unsupported = OperatingSystemFactory.getInstance("MAC", "11.0", "x64");
    }
}

