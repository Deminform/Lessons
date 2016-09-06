package com.tasks.myPatterns.factoryMethod;

public class ViolinistFactory implements MusicianFactory {
    @Override
    public Musician createMusician() {
        return new Violinist();
    }
}
