package com.kodilla.good.patterns.challenges;

public class Order {
    private final User user;
    private final Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product=" + product +
                '}';
    }
}
