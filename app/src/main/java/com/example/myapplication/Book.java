package com.example.myapplication;

public class Book  {

    private String book_name;
    private int id_author, id_book, id_genre;
    private String image, inf;

    // Конструктор
    public Book(String book_name, int id_book, int id_author, int id_genre, String image, String inf ) {
        this.book_name = book_name;
        this.id_author = id_author;
        this.id_book = id_book;
        this.id_genre = id_genre;
        this.image = image;
        this.inf = inf;
}



    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    public int getBook() {
        return id_book;
    }

    public void setBook(int id_book) {
        this.id_book = id_book;
    }
    public int getId_author() {
        return id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public int getId_genre() {
        return id_genre;
    }

    public void setId_genre(int id_genre) {
        this.id_genre = id_genre;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }


}

