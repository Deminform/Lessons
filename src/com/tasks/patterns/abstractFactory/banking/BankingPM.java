package com.tasks.patterns.abstractFactory.banking;

import com.tasks.patterns.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages baking project...");
    }
}
