package com.example.demo;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.UUID;

@SpringBootApplication
@EnableEurekaClient
public class OrderServiceApplication implements CommandLineRunner {

    private OrderDao orderDao;

    @Autowired
    public OrderServiceApplication(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        orderDao.save(new OrderEntity(UUID.randomUUID().toString(),"Pen",10.0));
        orderDao.save(new OrderEntity(UUID.randomUUID().toString(),"Pencil",11.0));
        orderDao.save(new OrderEntity(UUID.randomUUID().toString(),"PenDrive",9.0));
        orderDao.save(new OrderEntity(UUID.randomUUID().toString(),"Laptop",101.0));
        orderDao.save(new OrderEntity(UUID.randomUUID().toString(),"Desktop",89.0));
        orderDao.save(new OrderEntity(UUID.randomUUID().toString(),"Speaker",2.0));

    }
}
