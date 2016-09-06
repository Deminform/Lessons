package com.tasks.myPatterns.abstractFactory.wedding;

import com.tasks.myPatterns.abstractFactory.Conductor;

public class WeddingGroupConductor implements Conductor {
    @Override
    public void conduct() {
        System.out.println("Conductor conduct music group...");
    }
}
