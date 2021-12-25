package com.company;

public class Department {
    private final Books[] book = new Books[5];
    private final Department[] departments = new Department[5];


    public void setSingleNewBooks(Books books){
        for (int i = 0; i <this.book.length; i++){
            if (this.book[i] == null){
                this.book[i] = books;
                break;
            }
        }
    }

    public void ShowAllBooks(){
        for (int i = 0; i < book.length; i++){
            System.out.println(book);
        }
    }

    public void ShowAllInformation(){
        for (int i = 0; i < departments.length; i++){
            System.out.println(departments);
        }
    }

    public void searchByAutorBooks(){
        for (Books book : book){
            if(book != null && book.getAutor().equals(book)){
                System.out.println(book);
            }
        }
    }

    public void getNumberOfBooks(){
        for (int i = 0; i < departments.length; i++){
            System.out.println(departments);
        }
    }
}
