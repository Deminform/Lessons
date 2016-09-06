package com.tasks.myPatterns.builder;

public class BuildSongRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new BirthdaySongBuilder());
        Song song = director.buildSong();

        System.out.println(song);
    }
}
