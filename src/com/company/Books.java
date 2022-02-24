package com.company;

public class Books {
    private int id;
    private String autor;
    private String date;

    public Books(int id, String autor, String date) {
        this.id = id;
        this.autor = autor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", автор ='" + autor + '\'' +
                ", год выпуска ='" + date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}