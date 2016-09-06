package com.tasks.myPatterns.visitor;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();

        Musician guitarist = new GuitarMusician();
        Musician manager = new Manager();

        System.out.println("Guitarist in Action...\n");
        project.beToCompose(guitarist);

        System.out.println("\n============================================\n");

        System.out.println("Manager in Action...\n");
        project.beToCompose(manager);
    }
}
