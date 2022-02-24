package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        OfArt art = new OfArt("Art", 50, new Books[]{new Books(1, "Yuval Noah Harrari", "12.01.12"), new Books(2, "LevTolstoy", "1828"), new Books(3, "Alexandr pushcin", "1799")});
        Legal legal = new Legal();
        Technical technical = new Technical();
        int point;
        System.out.println(art);
        do {
            System.out.println("-------------Добавить-------------------");
            System.out.println("1. Добавить в худ ");
            System.out.println("2. Добавить в тех ");
            System.out.println("3. Добавить в юр ");
            System.out.println("-------------Показать-------------------");
            System.out.println("4. Показать books худ");
            System.out.println("5. Показать books тех ");
            System.out.println("6. Показать books юр ");
            System.out.println("--------------------------------------");
            System.out.println("7. Показать всю информацию худ ");
            System.out.println("8. Показать всю информацию тех ");
            System.out.println("9. Показать всю информацию юр ");
            System.out.println("---------------Поиск по названию группы--------------");
            System.out.println("10. Поиск в худ for name");
            System.out.println("11. Поиск в тех for name");
            System.out.println("12. Поиск в юр  for name");
            point = scanner.nextInt();
            switch (point) {
                case 1:
                    art.addBook(art.getBooks());
                    break;
                case 4:
                    art.showAllBooks(art.getBooks());
                    break;
                case 7:
                    art.informationAboutDepartment(art.getBooks());
                    break;
                case 10:
                    System.out.print("введите имя автора: ");
                    String nameThe = scanner.next();
                    art.foundBooks(art.getBooks(), nameThe);
                    break;
                case 11:
                    System.out.println(art.countOfBooks(art.getBooks()));
                    break;
            }
            System.out.println(art);

        } while (point != 0);
    }
}
