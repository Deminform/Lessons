package com.tasks.myPatterns.visitor;

public class Manager implements Musician {
    @Override
    public void create(ProjectSong projectSong) {
        System.out.println("Estimates new song");
    }

    @Override
    public void create(Albom albom) {
        System.out.println("Adding new song to albom");
    }

    @Override
    public void create(Training training) {
        System.out.println("Checks the sound quality");
    }
}
