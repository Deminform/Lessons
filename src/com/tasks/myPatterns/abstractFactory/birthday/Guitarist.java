package com.tasks.myPatterns.abstractFactory.birthday;

import com.tasks.myPatterns.abstractFactory.Musician;

public class Guitarist implements Musician {
    @Override
    public void playSong() {
        System.out.println("Guitarist plays song...");
    }
}
