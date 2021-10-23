package com.example.demo.rest;

import com.example.demo.entity.OrderEntity;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {

    private OrderService orderService;

    @Autowired
    public OrderServiceController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderEntity orderEntity)
    {
        orderEntity.setId(UUID.randomUUID().toString());
        return orderService.createOrder(orderEntity);
    }
    @GetMapping
    public List<OrderEntity> fetchAll()
    {
        return orderService.fetchAllOrders();
    }
}
