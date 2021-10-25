package com.example.secureorderservice.service;

import com.example.secureorderservice.model.Order;

import java.util.List;

public interface OrderService {
    public Order createOrder(Order order);
    public List<Order> fetchOrders();
    public Order findOrderByOrderId(String orderId);
    public Order removeOrder(String id);
    public Order updateOrder(String id,Order order);
    public List<Order> findByOrderName(String orderName);

}
