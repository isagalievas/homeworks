package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = new Pizza();
        LaFinta laFinta = new LaFinta(500, 1.5);
        laFinta.getWeight();
        Pepperoni pepperoni = new Pepperoni(400, 1.5);
        Margaritas margarita = new Margaritas(450, 1.5);
        int point;
        do {
            System.out.println("1. Пицца № 1: Ла-Финта (с грибами)");
            System.out.println("2. Пицца № 2: Ла-Финта (без грибов)");
            System.out.println("3. Пицца № 3 : Пепперони (острая)");
            System.out.println("4. Пицца № 4:  Пепперони (не острая)");
            System.out.println("5. Пицца № 5: Маргарита (с мяса)");
            System.out.println("6.Пицца № 6: Маргарита (без мясом)");
            System.out.println();
            System.out.println("Закажите пиццу : ");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    laFinta.cookWithMushrooms();
                    laFinta.toDeliver();

                    break;
                case 2:
                    laFinta.cookWithoutMushrooms();
                    laFinta.toDeliver();
                    break;
                case 3:
                    pepperoni.cookingSpicy();
                    pepperoni.toDeliver();
                    break;
                case 4:
                    pepperoni.cooking();
                    pepperoni.toDeliver();
                    break;
                case 5:
                    margarita.cookWithMeat();
                    margarita.toDeliver();
                    break;
                case 6:
                    margarita.cookWithoutMeat();
                    margarita.toDeliver();
                    break;
            }
        } while (point == 0);
    }
}
