package com.kumar.creational.builder;

public class Client {
    public static void main(String[] args) {
        final Director director = new Director(new EngineeringStudentBuilder());
        final Director director1 = new Director(new MBAStudentBuilder());

        final Student engineeringStudent = director.createStudent();
        final Student mbaStudent = director1.createStudent();

        System.out.println(engineeringStudent);
        System.out.println(mbaStudent);
    }
}
