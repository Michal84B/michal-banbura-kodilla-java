package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("Welcome in Healthy Shop, we have only healthful products");
        return true;
    }
}
