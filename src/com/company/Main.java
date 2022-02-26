package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order newOrder = new Order();
        newOrder.setId(1);
        newOrder.setDateOrder(LocalDate.now());
        newOrder.setTimeOrder(LocalTime.now());


        Product newProduct = new Product();
        newProduct.setName("Веселый молочник");
        newProduct.setName("Говядина");
        newProduct.setName("Форель");
        newProduct.setName("Чебуреки");
        newProduct.setType(ProductType.MILK);
        newProduct.setType(ProductType.MEAT);
        newProduct.setType(ProductType.FISH);
        newProduct.setType(ProductType.FLOUR);
        newOrder.setProducts(new ArrayList<>());
        newOrder.getProducts().add(newProduct);

        orders.add(newOrder);

        System.out.println(orders);
    }
}
