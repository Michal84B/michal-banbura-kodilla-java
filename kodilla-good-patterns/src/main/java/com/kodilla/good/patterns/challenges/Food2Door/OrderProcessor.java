package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    public void orderProcessor (Producer producer, Order order) {
        boolean isOrdered = producer.process(order);
        if(isOrdered) {
            System.out.println("Thank you, your order is created");
        } else {
            System.out.println("Order not created, try again");
        }
    }
}
