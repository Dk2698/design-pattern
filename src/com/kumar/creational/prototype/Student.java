package com.kumar.creational.prototype;

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