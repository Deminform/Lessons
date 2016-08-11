package com.tasks.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/proselytear/realproject");

        project.run();
    }
}
