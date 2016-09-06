package com.tasks.myPatterns.abstractFactory.wedding;

import com.tasks.myPatterns.abstractFactory.Conductor;
import com.tasks.myPatterns.abstractFactory.Manager;
import com.tasks.myPatterns.abstractFactory.MusicGroupFactory;
import com.tasks.myPatterns.abstractFactory.Musician;

public class WeddingGroupFactory implements MusicGroupFactory {
    @Override
    public Musician getMusician() {
        return new Pianist();
    }

    @Override
    public Conductor getConductor() {
        return new WeddingGroupConductor();
    }

    @Override
    public Manager getManager() {
        return new WeddingGroupManager();
    }
}
