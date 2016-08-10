package com.tasks.patterns.abstractFactory.website;

import com.tasks.patterns.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
