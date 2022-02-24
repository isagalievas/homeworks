package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 1; i < circles.length + 1; i++) {
            circles[i - 1] = new Circle(i);
        }
        int countingMultipleLapsOfThree = 0;
        for (Circle circle : circles) {
            if (circle.calculateTheAreaOfTheCircle() % 3 == 0) {
                countingMultipleLapsOfThree++;
            }
            System.out.println(circle.calculateTheAreaOfTheCircle());
        }
        System.out.println(countingMultipleLapsOfThree);

    }
}