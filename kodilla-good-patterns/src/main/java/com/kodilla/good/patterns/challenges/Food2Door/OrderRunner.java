package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRunner {
    public static void main(String[] args) {
        Product product1 = new Product("Fresh Salomon");
        Product product2 = new Product("Healthful radish");
        Product product3 = new Product("Gluten free pasta");

        Order order1 = new Order(product1, 2.5);
        Order order2 = new Order(product2, 24.0);
        Order order3 = new Order(product3, 5.0);

        OrderProcessor processor = new OrderProcessor();

        processor.orderProcessor(new ExtraFoodShop(), order1);
        processor.orderProcessor(new GlutenShop(), order3);
        processor.orderProcessor(new HealthyShop(), order2);
    }
}
