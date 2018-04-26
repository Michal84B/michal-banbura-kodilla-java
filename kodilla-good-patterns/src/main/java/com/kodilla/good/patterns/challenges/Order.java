package com.kodilla.good.patterns.challenges;


final class Order {
    private final User user;
    private final Product product;
    private final int idOrder;
    private final boolean isAvailable;

    public Order(final User user, final Product product, final int idOrder, final boolean isAvailable) {
        this.user = user;
        this.product = product;
        this.idOrder = idOrder;
        this.isAvailable = isAvailable;
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

    public boolean isAvailable() {
        return true;
    }
}
