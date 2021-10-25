package com.example.secureorderservice.service;

import com.example.secureorderservice.model.Order;

import java.util.List;

public interface OrderService {
    public Order createOrder(Order order);
    public List<Order> fetchOrders();
    public Order findOrderById(Integer orderId);
    public Order removeOrder(Integer orderId);
    public Order updateOrder(Integer orderId,Order order);
}
