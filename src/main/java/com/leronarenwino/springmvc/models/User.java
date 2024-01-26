package com.leronarenwino.springmvc.models;

public class User {

    private final String name;
    private final String lastname;
    private String email;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
