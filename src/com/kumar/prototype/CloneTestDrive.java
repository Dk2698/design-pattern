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
