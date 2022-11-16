package com.example.demo.model;

import java.util.List;

public class Actor {

    private String name;
    private String lastName;
    private String dateOfBirth;

    public static List<String> filmography;


    public Actor(String name, String lastName, String dateOfBirth, List<String> filmography) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
