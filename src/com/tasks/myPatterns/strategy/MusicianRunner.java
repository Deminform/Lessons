package com.tasks.myPatterns.strategy;

public class MusicianRunner {
    public static void main(String[] args) {
        Musician musician = new Musician();

        musician.setActivity(new Sleeping());
        musician.executeActivity();

        musician.setActivity(new Training());
        musician.executeActivity();

        musician.setActivity(new Writing());
        musician.executeActivity();

        musician.setActivity(new PlayMusic());
        musician.executeActivity();

        musician.setActivity(new Sleeping());
        musician.executeActivity();
    }
}
