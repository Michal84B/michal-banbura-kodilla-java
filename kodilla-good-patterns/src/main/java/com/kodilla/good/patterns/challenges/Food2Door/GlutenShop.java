package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("Welcome in the Gluten Shop, we have finest gluten free products");
        return true;
    }
}
