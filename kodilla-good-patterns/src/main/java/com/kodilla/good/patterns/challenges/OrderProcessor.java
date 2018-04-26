package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private final OrderService orderService;

    public OrderProcessor(final OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final Order order){
        boolean ordered = orderService.CreateOrder(order.getUser(), order.getProduct());
        return new OrderDto(order.getProduct(), order.getUser(), true);
    }
}
