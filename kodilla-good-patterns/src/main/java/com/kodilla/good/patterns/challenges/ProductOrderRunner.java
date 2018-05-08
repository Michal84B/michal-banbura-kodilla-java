package com.kodilla.good.patterns.challenges;

public class ProductOrderRunner {
    public static void main(String[] args){
        final User user = new User("JK21", "Jan", "Kowalski");
        final Product product = new Product("Nokia 6110",156.00);
        final Order order = new Order(user, product);
        final OrderProcessor processor = new OrderProcessor(new ProductOrderService(), new RepositoryService());
        final OrderDto orderDto = processor.process(order);

    }
}
