package com.kodilla.patterns.strategy.social;

public class TwiterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}
