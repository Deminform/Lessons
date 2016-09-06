package com.tasks.myPatterns.builder;

public class BirthdaySongBuilder extends SongBuilder{
    @Override
    void buildName() {
        song.setName("Birthday song");
    }

    @Override
    void buildGenre() {
        song.setGenre(Genre.POP);
    }

    @Override
    void buildPrice() {
        song.setPrice(4000);
    }
}
