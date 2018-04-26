package com.kodilla.good.patterns.challenges;

public class User {

    private final String username;
    private final String firstName;
    private final String lastName;

    public User(final String username, final String firstName, final String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
