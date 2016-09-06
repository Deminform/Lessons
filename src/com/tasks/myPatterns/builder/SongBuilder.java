package com.tasks.myPatterns.builder;

public abstract class SongBuilder {
    Song song;

    void createSong(){
        song = new Song();
    }

    abstract void buildName();
    abstract void buildGenre();
    abstract void buildPrice();

    Song getSong(){
        return song;
    }
}
