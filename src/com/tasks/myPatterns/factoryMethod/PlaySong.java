package com.tasks.myPatterns.factoryMethod;

public class PlaySong {
    public static void main(String[] args) {
        MusicianFactory musicianFactory = createMusicianBySpeciality("violinist");
        Musician musician = musicianFactory.createMusician();

        musician.playMusic();
    }
    static MusicianFactory createMusicianBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("piano")){
            return new PianistFactory();
        } else if (speciality.equalsIgnoreCase("guitar")){
            return new GuitaristFactory();
        } else if (speciality.equalsIgnoreCase("violinist")){
            return new ViolinistFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown specialty.");
        }
    }
}
