package com.kumar.creational.factory;

public class EmployeeFactory {

    EmployeeFactory(){}

    static Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("WEB")) {
            return new WebDeveloper();
        } else if (empType.trim().equalsIgnoreCase("ANDROID")) {
            return new AndroidDeveloper();
        } else {
            return null;
        }
    }
}
