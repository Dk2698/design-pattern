package com.kumar.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(23, 50, "ram");
        System.out.println(student.toString());
//        Student cloneObj = new Student();
//        cloneObj.age = student.age;
//        cloneObj.name = student.name;
        Student cloneObj = (Student) student.clone();
        System.out.println(cloneObj.toString());

    }
}
