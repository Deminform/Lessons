package com.tasks.myPatterns.state;

public class Sleep implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping");
    }
}
