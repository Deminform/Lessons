package com.tasks.myPatterns.builder;

public class Director {
    SongBuilder builder;

    public void setBuilder(SongBuilder builder){
        this.builder = builder;
    }

    Song buildSong(){
        builder.createSong();
        builder.buildName();
        builder.buildGenre();
        builder.buildPrice();

        Song song = builder.getSong();

        return song;
    }
}
