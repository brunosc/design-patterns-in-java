package com.patterns.memento;

import java.util.Stack;

class Caretaker {
    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }
}
