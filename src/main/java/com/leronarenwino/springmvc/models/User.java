package com.leronarenwino.springmvc.models;

public class User {

    private final String name;
    private final String lastname;

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

}
