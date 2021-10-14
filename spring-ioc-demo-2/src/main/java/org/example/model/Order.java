package org.example.model;

public class Order {
    private Integer orderId;
    private String orderName;
    private Integer orderQuantity;
    private  Double orderValue;

    public Order() {
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setOrderValue(Double orderValue) {
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
