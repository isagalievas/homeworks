package com.company;

import java.util.Scanner;

public class Department {

    Scanner scanner = new Scanner(System.in);

    private String name;
    protected int count = 0;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }


    public void addBook(Books[] books) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                System.out.print("Введите id: ");
                int id = scanner.nextInt();

                System.out.print("Введите автора: ");
                String name = scanner.next();

                System.out.print("Введите год выпуска: ");
                String date = scanner.next();

                books[i] = new Books(id, name, date);
                break;
            }
        }

    }

    public void showAllBooks(Books[] books) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    public void informationAboutDepartment(Books[] books) {

        System.out.println("Имя: " + name + "\nКнига: ");
        for (Books book : books) {
            if (book != null) {
                System.out.println(book + ",\t");
            }
        }

    }

    public void foundBooks(Books[] books, String autor) {

        for (Books book : books) {
            if (book != null) {
                if (book.getAutor().equals(autor)) {
                    System.out.println(book);
                }
            }

        }

    }

    public int countOfBooks(Books[] books) {
        int counts = 0;
        for (Books book : books) {
            if (book != null) {
                counts++;
            }

        }
        return counts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}