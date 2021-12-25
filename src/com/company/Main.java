package com.company;

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14;
        int radius = 5;

        int array[] = new int[10];
        for (int i = 1; i < array.length; i++){
            array[i] = i;
        }

        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга равна: " + area);
    }
}

