package com.example.secureorderservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_table")
public class Order {
    @Column(name = "unique_id",unique = true)
    private String id;
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "order_name")
    private String orderName;
    @Column(name = "order_price")
    private Double orderPrice;
}
