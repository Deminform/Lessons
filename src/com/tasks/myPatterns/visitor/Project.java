package com.tasks.myPatterns.visitor;

public class Project implements Song {
    Song[] songs;

    public Project(){
        this.songs = new Song[]{
                new ProjectSong(),
                new Albom(),
                new Training()
        };
    }

    @Override
    public void beToCompose(Musician musician) {
        for (Song song : songs){
            song.beToCompose(musician);
        }
    }
}
