package com.tasks.myPatterns.state;

public class MusicianDay {
    public static void main(String[] args) {
        Activity activity = new PlayMusic();

        Musician musician = new Musician();

        musician.setActivity(activity);

        for (int i=0; i<10; i++){
            musician.justDoIt();
            musician.changeActivity();
        }
    }
}
