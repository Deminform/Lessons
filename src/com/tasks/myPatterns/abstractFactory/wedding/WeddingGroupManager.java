package com.tasks.myPatterns.abstractFactory.wedding;

import com.tasks.myPatterns.abstractFactory.Manager;

public class WeddingGroupManager implements Manager {
    @Override
    public void manageGroup() {
        System.out.println("Wedding manager manages music group on wedding");
    }
}
