package com.tasks.myPatterns.abstractFactory.wedding;

import com.tasks.myPatterns.abstractFactory.Musician;

public class Pianist implements Musician {
    @Override
    public void playSong() {
        System.out.println("Pianist plays song...");
    }
}
