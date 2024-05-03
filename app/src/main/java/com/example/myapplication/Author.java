package com.example.myapplication;
import java.util.List;
public class Author {
    private int id_author ;
    private String author_name;
    private String inf;
    private List<Integer> bookIds;

    public Author(int id_author, String author_name, String inf, List<Integer> bookIds) {
        this.id_author = id_author;
        this.author_name = author_name;
        this.inf = inf;
        this.bookIds = bookIds;
    }

    public int getAuthor() {
        return id_author;
    }

    public void setAuthor(int id_author) {
        this.id_author = id_author;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getInf() {
        return inf;
    }

    public void setInf(String inf) {
        this.inf = inf;
    }
    public List<Integer> getBookIds() {
        return bookIds;
    }

    public void setBookIds(List<Integer> bookIds) {
        this.bookIds = bookIds;
    }
}