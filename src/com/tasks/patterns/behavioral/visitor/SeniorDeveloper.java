package com.tasks.patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after Junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fix database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
