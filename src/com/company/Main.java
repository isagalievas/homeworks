package com.company;

public class Main {

    public static void main(String[] args) {
        OfArt art = new OfArt("Филип Хеншер ", 12);
        System.out.println(art);


        Legal legal = new Legal("Юридические Хитрости ", 15);
        System.out.println(legal);


        Technical technical = new Technical("Машины", 10);
        System.out.println(technical);
    }
}
