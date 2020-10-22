package com.patterns.adapter;

class EmployeeLdap {

    private final String cn;
    private final String surname;
    private final String givenName;
    private final String mail;

    EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    String getCn() {
        return cn;
    }

    String getSurname() {
        return surname;
    }

    String getGivenName() {
        return givenName;
    }

    String getMail() {
        return mail;
    }
}
