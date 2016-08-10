package com.tasks.patterns.abstractFactory.website;

import com.tasks.patterns.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
