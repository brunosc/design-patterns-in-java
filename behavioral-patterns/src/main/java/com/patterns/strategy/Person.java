package com.patterns.strategy;

class Person {
    private int age;
    private String name;
    private String phoneNumber;

    Person() {

    }

    Person(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
