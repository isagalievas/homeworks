package com.company;

public enum Animal{
    CAT("Мурзик"),
    DOG("Бобик"),
    PARROT("Кеша"),
    HOSRE("Бутамир"),
    COW("Муся");



    private String name;

    Animal(String title) {
        this.name = title;
    }

    public String getTitle() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
