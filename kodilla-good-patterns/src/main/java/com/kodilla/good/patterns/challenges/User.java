package com.kodilla.good.patterns.challenges;

final class User {
    private final String username;
    private final String firstName;
    private final String surName;
    private final String adress;

    public User(final String username, final String firstName, final String surName, final String adress) {
        this.username = username;
        this.firstName = firstName;
        this.surName = surName;
        this.adress = adress;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getAdress() {
        return adress;
    }
}
