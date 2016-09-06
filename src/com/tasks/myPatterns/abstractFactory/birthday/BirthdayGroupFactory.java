package com.tasks.myPatterns.abstractFactory.birthday;

import com.tasks.myPatterns.abstractFactory.Conductor;
import com.tasks.myPatterns.abstractFactory.Manager;
import com.tasks.myPatterns.abstractFactory.MusicGroupFactory;
import com.tasks.myPatterns.abstractFactory.Musician;

public class BirthdayGroupFactory implements MusicGroupFactory {
    @Override
    public Musician getMusician() {
        return new Guitarist();
    }

    @Override
    public Conductor getConductor() {
        return new BirthdayGroupConductor();
    }

    @Override
    public Manager getManager() {
        return new BirthdayGroupManager();
    }
}
