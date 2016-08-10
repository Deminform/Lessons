package com.tasks.patterns.abstractFactory.website;

import com.tasks.patterns.abstractFactory.ProjectManager;
import com.tasks.patterns.abstractFactory.ProjectTeamFactory;

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
