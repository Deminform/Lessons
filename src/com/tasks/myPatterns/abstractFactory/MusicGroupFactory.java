package com.tasks.myPatterns.abstractFactory;

public interface MusicGroupFactory {
    Musician getMusician();
    Conductor getConductor();
    Manager getManager();
}
