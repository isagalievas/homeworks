package com.company;

public class Pepperoni extends Pizza {
    private int price;
    private double weight;

    public Pepperoni(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void toDeliver() {
        System.out.println("\nВес: " + weight + "\nЦена: " + price);
        System.out.println("Скоро вам доставят ваш заказ!");
    }

    public static void cookingSpicy() {
        System.out.println("Готовим вашу пиццу № 3 (Пепперони острая)");
    }

    public static void cooking() {
        System.out.println("Готовим вашу пиццу № 4 (Пепперони не острая)");
    }

    @Override
    public String toString() {
        return "Пицца:" + "\nВес: " + weight + " грамм" +
                "\nЦена: " + price;
    }
}
