package com.example.secureorderservice.service;

import com.example.secureorderservice.dao.OrderDao;
import com.example.secureorderservice.exception.OrderNotFoundException;
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
        return orderDao.save(order);
    }

    @Override
    public List<Order> fetchOrders() {
        return orderDao.findAll();
    }

    @Override
    public Order findOrderByOrderId(String orderId) {
        Order order=orderDao.findByUniqueId(orderId);
        if (order==null)
        {
            throw new OrderNotFoundException("order with the "+orderId+" is not found");
        }
        return order;
    }

    @Override
    public Order removeOrder(String id) {
        Order order=orderDao.findByUniqueId(id);
        if (order==null)
        {
            throw new OrderNotFoundException("order with the "+id+" is not found");
        }
        orderDao.delete(order);
        return order;
    }




    @Override
    public Order updateOrder(String id, Order order) {

        Order tempOrder=orderDao.findByUniqueId(id);
        if (order==null)
        {
            throw new OrderNotFoundException("order with the "+id+" is not found");
        }
        tempOrder.setOrderName(order.getOrderName());
        tempOrder.setOrderPrice(order.getOrderPrice());
        orderDao.save(tempOrder);
        return tempOrder;
    }

    @Override
    public List<Order> findByOrderName(String orderName) {
        return orderDao.findByOrderName(orderName);
    }
}
