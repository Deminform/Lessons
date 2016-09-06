package com.tasks.myPatterns.visitor;

public class Albom implements Song {
    @Override
    public void beToCompose(Musician musician) {
        musician.create(this);
    }
}
