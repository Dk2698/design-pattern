package com.kumar.creational.builder;

public class Director {

    private final StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }


    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMbsStudent();
        }
        return null;
    }

    private Student createMbsStudent() {
        return studentBuilder
                .setRollNumber(1)
                .setAge(22)
                .setName("suraj")
                .setSubjects()
                .build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder
                .setRollNumber(2)
                .setAge(24)
                .setName("Kumar")
                .setSubjects()
                .build();
    }
}
