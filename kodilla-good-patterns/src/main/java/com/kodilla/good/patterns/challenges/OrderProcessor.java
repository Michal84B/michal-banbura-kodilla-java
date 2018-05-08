package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private final OrderService orderService;
    private final RepositoryService repositoryService;

    public OrderProcessor(final OrderService orderService, final RepositoryService repositoryService) {
        this.orderService = orderService;
        this.repositoryService = repositoryService;
    }

    public OrderDto process(final Order order){
        boolean ordered = orderService.createOrder(order.getUser(), order.getProduct());

        if (ordered) {
            repositoryService.saveOrder(order);
            return new OrderDto(order.getProduct(), order.getUser(), true);
        } else {
            return new OrderDto(order.getProduct(), order.getUser(), false);
        }
    }
}
