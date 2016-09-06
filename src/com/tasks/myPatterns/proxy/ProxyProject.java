package com.tasks.myPatterns.proxy;

public class ProxyProject implements Project {
    private String url;
    private MusicProject musicProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (musicProject == null){
            musicProject = new MusicProject(url);
        }
        musicProject.run();
    }
}
