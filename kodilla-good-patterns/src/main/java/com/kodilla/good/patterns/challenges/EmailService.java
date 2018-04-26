package com.kodilla.good.patterns.challenges;

public class EmailService implements InformationService {

    private final String message;
    private final User user;

    public EmailService(final String message, final User user) {
        this.message = message;
        this.user = user;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public User getUser() {
        return user;
    }
}
