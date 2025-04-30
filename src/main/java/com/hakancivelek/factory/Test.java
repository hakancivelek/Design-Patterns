package com.hakancivelek.factory;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        HR hr = new HR();
        PayrollOffice payrollOffice = new PayrollOffice();

        Factory employeeFactory = new EmployeeFactory();
        Factory managerFactory = new ManagerFactory();
        Factory directorFactory = new DirectorFactory();

        hr.addNewEmployee(employeeFactory.create());
        hr.addNewEmployee(employeeFactory.create());
        hr.addNewEmployee(managerFactory.create());
        hr.addNewEmployee(managerFactory.create());
        hr.addNewEmployee(directorFactory.create());

        hr.listEmployees();

        System.out.println();

        List<Employee> employees = hr.getEmployees();

        for (Employee employee : employees)
            payrollOffice.paySalary(employee);
    }
}
