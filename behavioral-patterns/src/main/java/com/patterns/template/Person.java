package com.patterns.template;

class Person implements Comparable<Person> {

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

    @Override
    public int compareTo(Person o) {

        if(this.age > o.age) {
            return 1;
        }

        if(this.age < o.age) {
            return -1;
        }

        return 0;
    }
}
