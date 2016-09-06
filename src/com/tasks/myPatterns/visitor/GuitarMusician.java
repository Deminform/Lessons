package com.tasks.myPatterns.visitor;

public class GuitarMusician implements Musician{
    @Override
    public void create(ProjectSong projectSong) {
        System.out.println("Play music on guitar");
    }

    @Override
    public void create(Albom albom) {
        System.out.println("To compose songs for albom");
    }

    @Override
    public void create(Training training) {
        System.out.println("Training new songs");
    }
}
