package com.tasks.myPatterns.visitor;

public interface Musician {
    public void create(ProjectSong projectSong);
    public void create(Albom albom);
    public void create(Training training);
}
