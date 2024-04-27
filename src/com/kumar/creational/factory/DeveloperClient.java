package com.kumar.creational.factory;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("WEB");
        System.out.println("Salary : "+employee.salary());


        Employee employee1 = EmployeeFactory.getEmployee("Android");
        System.out.println("Salary : "+employee1.salary());
    }
}
