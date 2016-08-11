package com.tasks.patterns.creational.abstractFactory.banking;

import com.tasks.patterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages baking project...");
    }
}
