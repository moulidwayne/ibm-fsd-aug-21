package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
@Data
@NoArgsConstructor
public class OrderEntity {

    @Column(name = "unique_id")
    private String id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "order_name")
    private String orderName;
    @Column(name = "order_value")
    private Double orderValue;

    public OrderEntity(String id, String orderName, Double orderValue) {
        this.id = id;
        this.orderName = orderName;
        this.orderValue = orderValue;
    }
}
