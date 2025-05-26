import java.util.ArrayList;
import java.util.List;

package com.bakery.controller;


public class OrderController {
    private List<Order> orders;

    public OrderController() {
        this.orders = new ArrayList<>();
    }

    public void createOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(int orderId) {
        return orders.stream()
                .filter(order -> order.getId() == orderId)
                .findFirst()
                .orElse(null);
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public boolean updateOrder(int orderId, Order updatedOrder) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == orderId) {
                orders.set(i, updatedOrder);
                return true;
            }
        }
        return false;
    }

    public boolean deleteOrder(int orderId) {
        return orders.removeIf(order -> order.getId() == orderId);
    }
}