package com.example.secureorderservice.controller;

import com.example.secureorderservice.dto.OrderDto;
import com.example.secureorderservice.model.Order;
import com.example.secureorderservice.service.OrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private OrderService orderService;
    private ModelMapper modelMapper;

    @Autowired
    public OrderController(OrderService orderService, ModelMapper modelMapper) {
        this.orderService = orderService;
        this.modelMapper = modelMapper;
    }

    @PostMapping
    public ResponseEntity<OrderDto> createNewOrder(@RequestBody OrderDto orderDto)
    {
        orderDto.setId(UUID.randomUUID().toString());
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Order order=modelMapper.map(orderDto,Order.class);
        orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(order,OrderDto.class));

    }
    @GetMapping
    public ResponseEntity<List<OrderDto>> fetchAllOrders()
    {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<Order> orders=orderService.fetchOrders();
        List<OrderDto> orderDtos=new ArrayList<>();
        for(Order o:orders)
        {
            orderDtos.add(modelMapper.map(o,OrderDto.class));
        }
        return ResponseEntity.status(HttpStatus.OK).body(orderDtos);
    }
}
