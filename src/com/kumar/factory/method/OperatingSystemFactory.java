package com.kumar.factory.method;

/**
 * The OperatingSystemFactory class is responsible for creating instances
 * of OperatingSystem based on the specified type.
 */
public class OperatingSystemFactory {
    private OperatingSystemFactory() {
        // Private constructor to prevent instantiation
    }

    /**
     * Factory method to create an instance of OperatingSystem.
     *
     * @param type the type of operating system (WINDOWS or LINUX)
     * @param version the version of the operating system
     * @param architecture the architecture of the operating system
     * @return an instance of OperatingSystem
     */
    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type.toUpperCase()) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not supported");
        }
    }
}