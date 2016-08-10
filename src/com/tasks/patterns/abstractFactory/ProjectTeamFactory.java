package com.tasks.patterns.abstractFactory;

import com.tasks.patterns.abstractFactory.website.ManualTester;
import com.tasks.patterns.abstractFactory.website.PhpDeveloper;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ManualTester getTester();
    ProjectManager getProjectManager();
}
