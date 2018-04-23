package com.kodilla.good.patterns.challenges;


final class Order {
    private final User user;
    private final Product product;
    private final int idOrder;

    public Order(final User user, final Product product, final int idOrder) {
        this.user = user;
        this.product = product;
        this.idOrder = idOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getIdOrder() {
        return idOrder;
    }
}
