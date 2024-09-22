### Builder Design Pattern
Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes. 
There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

Too Many arguments to pass from client program to the Factory class that can be error prone because
most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument. 

Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and 
optional parameters need to send as NULL.

If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.

We can solve the issues with large number of parameters by providing a constructor with required parameters and 
then different setter methods to set the optional parameters. 
The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.
Builder pattern solves the issue with large number of optional parameters and 
inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
##### Problems solved by builder design pattern
    Creation -> Creating complex object
    Helps wuth immutable classes -> Define object which once created, never change  their value
    Less need for exposing setters


### how we can implement builder design pattern in java.
1.  First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class.
We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
2. Java Builder class should have a public constructor with all the required attributes as parameters.
3. Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
4. The final step is to provide a build() method in the builder class that will return the Object needed by client program.
For this we need to have a private constructor in the Class with Builder class as argument.

### define
    Builder is a creational design pattern, which allows constructing complex objects step by step.

# Student Builder Pattern in Java

This implementation demonstrates the Builder design pattern for creating `Student` objects in Java. The Builder pattern provides a flexible way to construct complex objects step-by-step.

## Code Structure

### 1. Student Class

Represents a `Student` with various attributes.

**`Student.java`**
```java
package com.kumar.builder;

import java.util.List;

public class Student {
    private int rollNumber;
    private int age;
    private String name;
    private String fatherName;
    private String mother;
    private List<String> subjects;

    // Constructor accepting a StudentBuilder
    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.mother = builder.mother;
        this.subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mother='" + mother + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
```
**`StudentBuilder.java`**
```java
package com.kumar.builder;

import java.util.List;

public abstract class StudentBuilder {
    int rollNumber;
    int age;
    String name;
    String fatherName;
    String mother;
    List<String> subjects;

    // Setters for common attributes
    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMother(String mother) {
        this.mother = mother;
        return this;
    }

    // Abstract method to set subjects; must be implemented by subclasses
    public abstract StudentBuilder setSubjects();

    // Build method to create a Student instance
    public Student build() {
        return new Student(this);
    }
}
```
**`MBAStudentBuilder.java`**
```java
package com.kumar.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("Micro Economics");
        subjectsList.add("Business Studies");
        subjectsList.add("Operations Management");
        this.subjects = subjectsList;
        return this;
    }
}
```
**`EngineeringStudentBuilder.java`**
```java
package com.kumar.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjectsList = new ArrayList<>();
        subjectsList.add("DSA");
        subjectsList.add("Operating Systems");
        subjectsList.add("Computer Organization and Architecture");
        this.subjects = subjectsList;
        return this;
    }
}
```
**`Director.java`**
```java
package com.kumar.builder;

public class Director {
    private final StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    // Creates a Student based on the builder type
    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMbaStudent();
        }
        return null;
    }

    // Configures and builds an MBA student
    private Student createMbaStudent() {
        return studentBuilder
                .setRollNumber(1)
                .setAge(22)
                .setName("Suraj")
                .setSubjects()
                .build();
    }

    // Configures and builds an Engineering student
    private Student createEngineeringStudent() {
        return studentBuilder
                .setRollNumber(2)
                .setAge(24)
                .setName("Kumar")
                .setSubjects()
                .build();
    }
}
```
**`Client.java`**
```java
package com.kumar.builder;

public class Client {
    public static void main(String[] args) {
        // Create director for Engineering students
        final Director engineeringDirector = new Director(new EngineeringStudentBuilder());
        final Director mbaDirector = new Director(new MBAStudentBuilder());

        // Build students
        final Student engineeringStudent = engineeringDirector.createStudent();
        final Student mbaStudent = mbaDirector.createStudent();

        // Output the created students
        System.out.println(engineeringStudent);
        System.out.println(mbaStudent);
    }
}
```