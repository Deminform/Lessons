package com.tasks.patterns.creational.abstractFactory.banking;

import com.tasks.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
