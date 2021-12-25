package com.company;

public class Legal extends Department {
    String name;
    int numberOfBooks;

    public Legal(String name, int numberOfBooks) {
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

    @Override
    public String toString() {
        String message = "Название книги " + this.name + ". Количество книги " + this.numberOfBooks;
        return message;
    }
}
