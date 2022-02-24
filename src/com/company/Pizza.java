package com.company;

public class Pizza {
    private int price;
    private double weight;
    private String cooking;
    private boolean toDeliver;

    public Pizza(int price, double weight, String cooking, boolean toDeliver) {
        this.price = price;
        this.weight = weight;
        this.cooking = cooking;
        this.toDeliver = toDeliver;
    }

    public void toDeliver(){
        System.out.println("\nВес: " + weight + "\nЦена: " + price);
        System.out.println("Скоро вам доставят ваш заказ!");
    }
    public Pizza() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCooking() {
        return cooking;
    }

    public void setCooking(String cooking) {
        this.cooking = cooking;
    }

    public boolean isToDeliver() {
        return toDeliver;
    }

    public void setToDeliver(boolean toDeliver) {
        this.toDeliver = toDeliver;
    }
}

