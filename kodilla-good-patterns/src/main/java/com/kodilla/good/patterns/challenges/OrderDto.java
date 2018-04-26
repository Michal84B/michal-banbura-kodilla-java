package com.kodilla.good.patterns.challenges;

public class OrderDto {

    private final User user;
    private final Product product;
    private final boolean isAvailable;

    public OrderDto(final User user, final Product product, boolean isAvailable) {
        this.user = user;
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
