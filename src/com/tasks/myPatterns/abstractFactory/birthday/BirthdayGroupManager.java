package com.tasks.myPatterns.abstractFactory.birthday;

import com.tasks.myPatterns.abstractFactory.Manager;

public class BirthdayGroupManager implements Manager {
    @Override
    public void manageGroup() {
        System.out.println("Birthday manager manages music group on birthday...");
    }
}
