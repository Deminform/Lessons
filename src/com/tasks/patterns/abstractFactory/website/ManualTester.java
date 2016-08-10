package com.tasks.patterns.abstractFactory.website;

import com.tasks.patterns.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code...");
    }
}
