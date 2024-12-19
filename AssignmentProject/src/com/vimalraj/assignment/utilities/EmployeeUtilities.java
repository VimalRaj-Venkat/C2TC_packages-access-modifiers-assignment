package com.vimalraj.assignment.utilities;
import com.vimalraj.assignment.employees.Employee;
import com.vimalraj.assignment.employees.Manager;
import com.vimalraj.assignment.employees.Developer;
public class EmployeeUtilities {
	public void displayEmployeeInfo(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    public void displayManagerInfo(Manager manager) {
        System.out.println("Department: " + manager.getDepartment());
    }

    public void displayDeveloperInfo(Developer developer) {
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
