package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(Order order) {
        System.out.println("You can order here some special food");
        return true;
    }
}
