package com.tasks.patterns.abstractFactory.banking;

import com.tasks.patterns.abstractFactory.Developer;
import com.tasks.patterns.abstractFactory.ProjectManager;
import com.tasks.patterns.abstractFactory.ProjectTeamFactory;
import com.tasks.patterns.abstractFactory.website.ManualTester;

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
