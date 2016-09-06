package com.tasks.myPatterns.builder;

public class Song {
    private String name;
    private Genre genre;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wedding{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                '}';
    }
}
