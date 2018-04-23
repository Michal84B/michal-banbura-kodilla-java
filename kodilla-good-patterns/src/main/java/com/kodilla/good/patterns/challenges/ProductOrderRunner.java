package com.kodilla.good.patterns.challenges;

public class ProductOrderRunner {
    public static void main(String[] args){
        User user = new User("JK1986", "Jan", "Kowalski", "Warszawa");
        Product product = new Product("Kalosze");
        Order order = new Order(user, product, 001);
    }
}
