package com.tasks.myPatterns.builder;

public class WeddingSongBuilder extends SongBuilder{
    @Override
    void buildName() {
        song.setName("Wedding song");
    }

    @Override
    void buildGenre() {
        song.setGenre(Genre.SERENADE);
    }

    @Override
    void buildPrice() {
        song.setPrice(7000);
    }
}
