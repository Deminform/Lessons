package com.tasks.myPatterns.visitor;

public class Training implements Song {
    @Override
    public void beToCompose(Musician musician) {
        musician.create(this);
    }
}
