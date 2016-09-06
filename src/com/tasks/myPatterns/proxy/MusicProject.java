package com.tasks.myPatterns.proxy;

public class MusicProject implements Project {
    private String url;

    public MusicProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading music from: " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Play music " + url + "...");
    }
}
