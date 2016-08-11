package com.tasks.patterns.creational.abstractFactory.banking;

import com.tasks.patterns.creational.abstractFactory.Developer;
import com.tasks.patterns.creational.abstractFactory.ProjectManager;
import com.tasks.patterns.creational.abstractFactory.ProjectTeamFactory;
import com.tasks.patterns.creational.abstractFactory.website.ManualTester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ManualTester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
