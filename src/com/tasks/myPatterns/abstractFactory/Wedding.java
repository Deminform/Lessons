package com.tasks.myPatterns.abstractFactory;

import com.tasks.myPatterns.abstractFactory.wedding.WeddingGroupFactory;

public class Wedding {
    public static void main(String[] args) {
        MusicGroupFactory musicGroupFactory = new WeddingGroupFactory();
        Musician musician = musicGroupFactory.getMusician();
        Conductor conductor = musicGroupFactory.getConductor();
        Manager manager = musicGroupFactory.getManager();

        System.out.println("Play song on wedding...\n");
        musician.playSong();
        conductor.conduct();
        manager.manageGroup();
    }
}
