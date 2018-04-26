package com.kodilla.good.patterns.challenges;

public class Product {
    private final String productName;
    private final double price;

    public Product(final String productName, final double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
