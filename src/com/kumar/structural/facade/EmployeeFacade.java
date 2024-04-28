package com.kumar.structural.facade;


public class EmployeeFacade {
    private EmployeeDAO employeeDAO;

    public EmployeeFacade(){
        employeeDAO = new EmployeeDAO();
    }


    public void insert(){
        employeeDAO.insert();
    }

    public Employee getEmployeeDeatils(int empId) {
        return employeeDAO.getEmployeeDetails(empId);
    }
}
