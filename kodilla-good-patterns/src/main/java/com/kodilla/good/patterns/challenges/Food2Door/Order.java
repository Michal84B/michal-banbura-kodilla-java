package com.kodilla.good.patterns.challenges.Food2Door;

public class Order {
    private final Product product;
    private final double qty;

    public Order(final Product product, final double qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public double getQty() {
        return qty;
    }
}
