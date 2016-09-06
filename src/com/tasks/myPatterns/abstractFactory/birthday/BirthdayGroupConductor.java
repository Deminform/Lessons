package com.tasks.myPatterns.abstractFactory.birthday;

import com.tasks.myPatterns.abstractFactory.Conductor;

public class BirthdayGroupConductor implements Conductor {
    @Override
    public void conduct() {
        System.out.println("Conductor conduct music group...");
    }
}
