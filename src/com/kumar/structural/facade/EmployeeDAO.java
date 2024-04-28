package com.kumar.structural.facade;

public class EmployeeDAO {

    public void insert(){
        // insert into Employee table
    }

    public void updateEmployeeName(){
        // update employee Name
    }

    public Employee getEmployeeDetails(String emailId){
        // get employee details based on email Id
        return new Employee();
    }

    public Employee getEmployeeDetails(int empId){
        // get employee details based on email Id
        return new Employee();
    }
}
