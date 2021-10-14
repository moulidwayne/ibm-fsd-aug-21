package org.example.model;

public class Customer {
    private Integer customerId;
    private String customerName;
    private Order order;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, Order order) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", order=" + order +
                '}';
    }
}
