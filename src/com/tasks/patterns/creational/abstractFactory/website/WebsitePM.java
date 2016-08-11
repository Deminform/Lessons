package com.tasks.patterns.creational.abstractFactory.website;

import com.tasks.patterns.creational.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
