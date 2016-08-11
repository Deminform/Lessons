package com.tasks.patterns.creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode = new CourceCode");
        System.out.println(master);

        System.out.println("\n=========================================\n");

        Project masterClone = new ProjectFactory(master).cloneProject();
        System.out.println(masterClone);
    }
}