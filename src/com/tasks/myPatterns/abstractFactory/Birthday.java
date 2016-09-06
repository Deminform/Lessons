package com.tasks.myPatterns.abstractFactory;

import com.tasks.myPatterns.abstractFactory.birthday.BirthdayGroupFactory;

public class Birthday {
    public static void main(String[] args) {
        MusicGroupFactory musicGroupFactory = new BirthdayGroupFactory();
        Musician musician = musicGroupFactory.getMusician();
        Conductor conductor = musicGroupFactory.getConductor();
        Manager manager = musicGroupFactory.getManager();

        System.out.println("Play song on birthday...\n");
        musician.playSong();
        conductor.conduct();
        manager.manageGroup();
    }
}
