package com.tit.uc4.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @PostMapping("/hello/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
class User {
    private String firstName;
    private String lastName;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
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
}

