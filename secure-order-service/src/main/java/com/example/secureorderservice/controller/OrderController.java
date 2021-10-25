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
        orderDto.setUniqueId(UUID.randomUUID().toString());
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
    @GetMapping("/{uniqueId}")
    public ResponseEntity<OrderDto> findByUniqueId(@PathVariable("uniqueId") String uniqueId)
    {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Order order=orderService.findOrderByOrderId(uniqueId);
        return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(order,OrderDto.class));
    }
    @GetMapping("/find/{orderName}")
    public ResponseEntity<List<OrderDto>> findByName(@PathVariable("orderName")String orderName)
    {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<Order> orders=orderService.findByOrderName(orderName);
        List<OrderDto> orderDtos=new ArrayList<>();
        for(Order o:orders)
        {
            orderDtos.add(modelMapper.map(o,OrderDto.class));
        }
        return ResponseEntity.status(HttpStatus.OK).body(orderDtos);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<OrderDto> deleteOrder(@PathVariable("id") String id)
    {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Order order=orderService.removeOrder(id);
        return ResponseEntity.status(HttpStatus.OK).body(modelMapper.map(order,OrderDto.class));
    }
}
