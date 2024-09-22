# Factory Method Design Pattern in Java

This document describes the implementation of the Factory Method Design Pattern using Java classes that simulate different operating systems.

## Overview

The Factory Method Design Pattern provides a way to create objects without specifying the exact class of object that will be created. It allows subclasses to alter the type of objects that will be created.

### Components

1. **OperatingSystem (Abstract Class)**
2. **LinuxOperatingSystem (Concrete Class)**
3. **WindowsOperatingSystem (Concrete Class)**
4. **OperatingSystemFactory (Factory Class)**
5. **OperatingSystemTestDrive (Test Class)**

---

#### 1. OperatingSystem (Abstract Class)
**`OperatingSystem.java`**
```java
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
```
#### 2. LinuxOperatingSystem (Concrete Class)
**`LinuxOperatingSystem.java`**
```java
package com.kumar.factory.method;

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
        System.out.println("Changing directory to: " + dir + " on Linux");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing directory: " + dir + " on Linux");
    }
}
```
#### 3. WindowsOperatingSystem (Concrete Class)
**`WindowsOperatingSystem.java`**
```java
package com.kumar.factory.method;

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
        System.out.println("Changing directory to: " + dir + " on Windows");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing directory: " + dir + " on Windows");
    }
}
```
#### 4. OperatingSystemFactory (Factory Class)
**`OperatingSystemFactory.java`**
```java
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

```
#### 5. OperatingSystemTestDrive (Test Class)
**`OperatingSystemTestDrive.java`**
```java
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
```
### Benefits of Design Patterns

Design patterns are proven solutions to common software design problems. They provide a shared vocabulary for developers and enhance the quality of software design. Here are some key benefits of using design patterns:

#### 1. Reusability

- **Code Reusability**: Patterns encapsulate best practices, making it easier to reuse code across different projects.
- **Reduction of Redundancy**: By using established patterns, developers avoid writing the same code multiple times.

#### 2. Maintainability

- **Easier Maintenance**: Patterns promote clear structure and organization, making code easier to understand and maintain.
- **Simplified Refactoring**: Changes can be made more easily without affecting the entire system.

#### 3. Improved Communication

- **Common Vocabulary**: Patterns provide a common language for developers to discuss design decisions, improving collaboration.
- **Documentation**: Patterns serve as documentation, helping new team members understand design choices quickly.

#### 4. Flexibility and Scalability

- **Adaptable Solutions**: Patterns allow for changes in system requirements without requiring complete rewrites.
- **Scalable Architecture**: Patterns help design systems that can grow and scale over time.

#### 5. Proven Solutions

- **Best Practices**: Patterns are based on tried-and-tested solutions, reducing the risk of failures due to poor design.
- **Enhanced Quality**: Using established patterns leads to higher-quality software, as they address common pitfalls.

#### 6. Encapsulation of Knowledge

- **Expertise Sharing**: Patterns capture the experience of expert developers, allowing less experienced developers to benefit from their insights.
- **Reduction of Learning Curve**: Familiarity with patterns can make it easier for developers to learn new frameworks and technologies.

#### 7. Consistency

- **Uniform Codebase**: Patterns lead to a consistent coding style, making it easier for teams to work together.
- **Standardized Approaches**: They promote standard approaches to problem-solving, which enhances the overall quality of the code.

### Conclusion

Incorporating design patterns into software development enhances code quality, maintainability, and communication among team members. By leveraging proven solutions, developers can build more robust, flexible, and scalable systems.