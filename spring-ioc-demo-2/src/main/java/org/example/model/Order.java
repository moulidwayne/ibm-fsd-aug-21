package org.example.model;

public class Order {
    private Integer orderId;
    private String orderName;
    private Integer orderQuantity;
    private  Double orderValue;

    public Order() {
    }

    public Order(Integer orderId, String orderName, Integer orderQuantity, Double orderValue) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderQuantity = orderQuantity;
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", orderValue=" + orderValue +
                '}';
    }
}
