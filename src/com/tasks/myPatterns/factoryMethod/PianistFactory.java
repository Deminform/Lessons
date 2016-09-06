package com.tasks.myPatterns.factoryMethod;

public class PianistFactory implements MusicianFactory {
    @Override
    public Musician createMusician() {
        return new Pianist();
    }
}
