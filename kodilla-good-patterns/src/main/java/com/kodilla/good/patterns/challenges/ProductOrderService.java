package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    @Override
    public boolean createOrder(User user, Product product) {
        System.out.println(user.getUsername() + " " + "ordered product: " + product.getProductName() + " " + "product price is: "
        + product.getPrice());
        return true;
    }
}
