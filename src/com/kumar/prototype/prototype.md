# Prototype Design Pattern in Java

The Prototype Design Pattern is a creational design pattern that allows you to create objects based on a template of an existing object through cloning. This pattern is particularly useful when the cost of creating a new instance of an object is more expensive than copying an existing instance.

## Key Concepts

1. **Prototype Interface**: This defines the method for cloning an object.
2. **Concrete Prototype**: This is a class that implements the prototype interface and defines how to clone itself.
3. **Client**: This uses the prototype to create new objects.

## Code Implementation

### Prototype Interface

**`Prototype.java`**

```java
package com.kumar.prototype;

public interface Prototype {
    Prototype clone(); // Method to clone an object
}
```
**`Student.java`**

```java
package com.kumar.prototype;

public class Student implements Prototype {
    private int age; // Age of the student
    private int rollNumber; // Roll number of the student
    private String name; // Name of the student

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Clone method to create a copy of the current Student instance
    @Override
    public Prototype clone() {
        return new Student(age, rollNumber, name); // Creates a new instance with the same attributes
    }

    // String representation of the Student object
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
```
**`CloneTestDrive.java`**
```java
package com.kumar.prototype;

public class CloneTestDrive {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student(23, 50, "ram");
        System.out.println(student.toString()); // Print original student details

        // Clone the original student object
        Student cloneObj = (Student) student.clone();
        System.out.println(cloneObj.toString()); // Print cloned student details
    }
}
```