package com.kumar.builder;

import java.util.List;

public class Student {
    private int rollNumber;
    private int age;
    private String name;
    private String fatherName;
    private String mother;
    private List<String> subjects;

    public Student(StudentBuilder builder) {
        this.rollNumber = builder.rollNumber;
        this.age = builder.age;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.mother = builder.mother;
        this.subjects = builder.subjects;
    }

    // Override toString for a meaningful representation
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
