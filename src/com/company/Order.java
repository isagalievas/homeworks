package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Order {
    private int id;
    private LocalDate dateOrder;
    private LocalTime timeOrder;
    private List<Product> products;

    public Order() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public void setTimeOrder(LocalTime timeOrder) {
        this.timeOrder = timeOrder;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateOrder=" + dateOrder +
                ", timeOrder=" + timeOrder +
                ", products=" + products +
                '}';
    }
}
