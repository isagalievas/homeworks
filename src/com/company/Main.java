package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число (ПРИМЕР 1 2 3 4 4 5 ...): ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}
