package com.tasks.myPatterns.proxy;

public class MusicPlayer {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://zaycev.net/pop/top100/potap_i_nastya/leto.mp3");

        project.run();
    }
}
