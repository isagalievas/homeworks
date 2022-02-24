package com.company;

public class Margaritas extends Pizza {
    private int price;
    private double weight;

    public Margaritas(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void toDeliver() {
        System.out.println("\nВес: " + weight + "\nЦена: " + price);
        System.out.println("Скоро вам доставят ваш заказ!");
    }

    public void cookWithMeat() {
        System.out.println("Готовим вашу пиццу №5 (Маргарита с мясом)");
    }

    public void cookWithoutMeat() {
        System.out.println("Готовим вашу пиццу №6 (Маргарита без мяса) ");
    }

    @Override
    public String toString() {
        return "Пицца: " + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price;
    }
}

