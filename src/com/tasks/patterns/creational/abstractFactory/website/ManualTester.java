package com.tasks.patterns.creational.abstractFactory.website;

import com.tasks.patterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code...");
    }
}
