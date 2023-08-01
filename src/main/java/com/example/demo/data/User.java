package com.example.demo.data;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5818262284981140286L;
    private String name;
    private String surname;
    private String emailAddress;

    public User(String name, String surname, String emailAddress) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}