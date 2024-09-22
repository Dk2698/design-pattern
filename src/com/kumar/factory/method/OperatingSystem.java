package com.kumar.factory.method;

/**
 * The OperatingSystem abstract class defines the structure for different
 * operating system implementations, including version and architecture.
 */
public abstract class OperatingSystem {
    private String version; // Version of the operating system
    private String architecture; // Architecture type (e.g., x86, x64)

    public OperatingSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * Abstract method to change the directory.
     *
     * @param dir the directory to change to
     */
    public abstract void changeDir(String dir);

    /**
     * Abstract method to remove a directory.
     *
     * @param dir the directory to remove
     */
    public abstract void removeDir(String dir);
}
