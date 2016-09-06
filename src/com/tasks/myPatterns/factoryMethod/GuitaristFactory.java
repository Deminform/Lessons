package com.tasks.myPatterns.factoryMethod;

public class GuitaristFactory implements MusicianFactory {
    @Override
    public Musician createMusician() {
        return new Guitarist();
    }
}
