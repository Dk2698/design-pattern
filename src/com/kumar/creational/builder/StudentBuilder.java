package com.kumar.creational.builder;

import java.util.List;

public abstract class StudentBuilder {

    int rollNumber;
    int age;
    String name;
    String fatherName;
    String mother;
    List<String> subjects;

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

    public abstract StudentBuilder setSubjects();

    Student build() {
        return new Student(this);
    }
}
