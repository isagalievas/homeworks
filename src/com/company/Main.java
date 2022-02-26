package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("Кот", "Муся");
        hashMap.put("Собака", "Барбоскин");
        hashMap.put("Лошадь", "Бутамир");
        hashMap.put("Лев", "Алекс");
        hashMap.put("Попугай", "Кеша");
        System.out.println(hashMap);
    }
}
