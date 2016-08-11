package com.tasks.patterns.creational.abstractFactory;

import com.tasks.patterns.creational.abstractFactory.website.ManualTester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ManualTester getTester();
    ProjectManager getProjectManager();
}
