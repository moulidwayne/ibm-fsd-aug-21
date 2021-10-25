package com.example.secureorderservice.dao;

import com.example.secureorderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao extends JpaRepository<Order,Integer> {

    public Order findByUniqueId(String id);
    public List<Order> findByOrderName(String orderName);


}
