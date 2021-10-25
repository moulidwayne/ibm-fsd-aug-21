package com.example.secureorderservice.service;

import com.example.secureorderservice.dao.OrderDao;
import com.example.secureorderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
import java.util.UUID;

@Service
@EnableTransactionManagement
public class OrderServiceImpl implements OrderService{
    private OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }


    @Override
    public Order createOrder(Order order) {
        order.setId(UUID.randomUUID().toString());
        return orderDao.save(order);
    }

    @Override
    public List<Order> fetchOrders() {
        return orderDao.findAll();
    }

    @Override
    public Order findOrderById(Integer orderId) {
        return orderDao.getById(orderId);
    }

    @Override
    public Order removeOrder(Integer orderId) {
        Order order=orderDao.getById(orderId);
        orderDao.delete(order);
        return order;
    }

    @Override
    public Order updateOrder(Integer orderId, Order order) {
        Order tempOrder=orderDao.getById(orderId);
        tempOrder.setOrderName(order.getOrderName());
        tempOrder.setOrderPrice(order.getOrderPrice());
        orderDao.save(tempOrder);
        return tempOrder;
    }
}
