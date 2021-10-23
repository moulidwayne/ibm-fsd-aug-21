package com.example.demo.service;

import com.example.demo.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    public OrderEntity createOrder(OrderEntity orderEntity);
    public List<OrderEntity> fetchAllOrders();
}
