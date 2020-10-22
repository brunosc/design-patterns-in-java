package com.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

class AdapterApplication {

    public static void main(String[] args) {
        final var app = new AdapterApplication();
        app.getEmployeeList().forEach(System.out::println);
    }

    private List<Employee> getEmployeeList() {
        final var employees = new ArrayList<Employee>();

        Employee employeeDb = new EmployeeDB("1", "Bruno", "Silva", "bruno@mail.com");
        EmployeeLdap employeeLdap = new EmployeeLdap("cn", "Bruno", "Martins", "bruno@mail.com");
        EmployeeCSV employeeCSV = new EmployeeCSV("123,Sherlock,Holmes,sherlock@holmes.com");

        employees.add(employeeDb);
        employees.add(new EmployeeAdapterLdap(employeeLdap));
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }

}
