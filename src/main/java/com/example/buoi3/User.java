package com.example.buoi3;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String whereuHear;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dob = "";
        whereuHear = "";
    }

    public User(String firstName, String lastName, String email, String dob, String whereuHear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.whereuHear = whereuHear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhereuHear() {
        return whereuHear;
    }

    public void setWhereuHear(String whereuHear){
        this.whereuHear = whereuHear;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }
}