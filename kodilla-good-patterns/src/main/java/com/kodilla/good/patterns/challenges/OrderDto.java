package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private final Product product;
    private final User user;
    private final boolean isOrdered;

    public OrderDto(final Product product, final User user, final boolean isOrdered) {
        this.product = product;
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
