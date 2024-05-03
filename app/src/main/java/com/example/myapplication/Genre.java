package com.example.myapplication;

public class Genre {
    private String id_genre;
    private String genre_name;

    public Genre(String id_genre, String genre_name) {
        this.id_genre = id_genre;
        this.genre_name = genre_name;
    }

    public String getGenre() {
        return id_genre;
    }

    public void setGenre(String id_genre) {
        this.id_genre = id_genre;
    }
    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
