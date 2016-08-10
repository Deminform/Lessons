package com.tasks.patterns.abstractFactory.banking;

import com.tasks.patterns.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
