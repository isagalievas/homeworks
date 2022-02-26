package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Character> characters = new HashSet<>();
        characters.add('1');
        characters.add('2');
        characters.add('3');
        characters.add('4');
        characters.add('4');
        characters.add('5');
        System.out.println(characters);
    }
}
