package com.example.demo.rest;

import com.example.demo.entity.OrderEntity;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity)
    {
        orderEntity.setId(UUID.randomUUID().toString());
        OrderEntity orderEntity1= orderService.createOrder(orderEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderEntity1);
    }
    @GetMapping
    public ResponseEntity<List<OrderEntity>> fetchAll()
    {
        return ResponseEntity.status(HttpStatus.OK).body(orderService.fetchAllOrders());
    }
}
