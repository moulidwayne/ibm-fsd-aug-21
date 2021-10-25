package com.example.secureorderservice.controller;

import com.example.secureorderservice.model.Order;
import com.example.secureorderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createNewOrder(@RequestBody Order order)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(order));
    }
    @GetMapping
    public ResponseEntity<List<Order>> fetchAllOrders()
    {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.fetchOrders());
    }
}
