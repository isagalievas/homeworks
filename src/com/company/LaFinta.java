package com.company;

public class LaFinta extends Pizza {
    private int price;
    private double weight;

    public LaFinta(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void toDeliver() {
        System.out.println("\nВес: " + weight + "\nЦена: " + price);
        System.out.println("Скоро вам доставят ваш заказ!");
    }

    public void cookWithMushrooms() {
        System.out.println("Готовим вашу пиццу №1 (Ла-Финта с грибами)");
    }

    public void cookWithoutMushrooms() {
        System.out.println("Готовим вашу пиццу №2 (Ла-Финта без грибов)");
    }

    @Override
    public String toString() {
        return "Пицца:" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price;
    }
}