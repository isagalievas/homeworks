package com.company;

import java.util.HashMap;
import java.util.Map;

import static com.company.Animal.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Animal> hashMap = new HashMap<>();

        hashMap.put("Кот", CAT);
        hashMap.put("Собака", DOG);
        hashMap.put("Попугай", PARROT);
        hashMap.put("Лошадь", HOSRE);
        hashMap.put("Корова", COW);
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
    }
}
