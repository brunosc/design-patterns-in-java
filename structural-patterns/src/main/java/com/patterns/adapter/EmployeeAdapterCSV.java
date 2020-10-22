package com.patterns.adapter;

class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return String.format("ID: %d, First name: %s", instance.getId(), instance.getFirstname());
    }
}
