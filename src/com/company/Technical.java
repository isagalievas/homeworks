package com.company;

public class Technical extends Department {
    String name;
    int numberOfBooks;

    public Technical(String name, int numberOfBooks) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    private boolean hascomputer;

    public Technical(boolean hascomputer) {
        this.hascomputer = hascomputer;
    }

    @Override
    public String toString() {
        String message = "Название книги " + this.name + ". Количество книги " + this.numberOfBooks;
        return message;
    }
}
