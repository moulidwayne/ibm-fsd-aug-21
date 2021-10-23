package com.example.demo.service;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@EnableTransactionManagement
public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao;

    @Autowired
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    @Transactional
    public OrderEntity createOrder(OrderEntity orderEntity) {
        return orderDao.save(orderEntity);
    }

    @Override
    public List<OrderEntity> fetchAllOrders() {
        return orderDao.findAll();
    }
}
