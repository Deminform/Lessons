package com.tasks.patterns.creational.abstractFactory.website;

import com.tasks.patterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
