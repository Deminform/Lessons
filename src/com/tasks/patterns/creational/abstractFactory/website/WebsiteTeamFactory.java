package com.tasks.patterns.creational.abstractFactory.website;

import com.tasks.patterns.creational.abstractFactory.ProjectManager;
import com.tasks.patterns.creational.abstractFactory.ProjectTeamFactory;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public PhpDeveloper getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ManualTester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
