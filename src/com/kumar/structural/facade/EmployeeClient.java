package com.kumar.structural.facade;

public class EmployeeClient {

    public void getEmployeeDetails(){
        final EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.getEmployeeDeatils(1);
    }
}
