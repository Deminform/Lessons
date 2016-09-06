package com.tasks.myPatterns.visitor;

public class ProjectSong implements Song {
    @Override
    public void beToCompose(Musician musician) {
        musician.create(this);
    }
}
