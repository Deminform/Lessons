package com.tasks.patterns.behavioral.memento;

public class GitgubRepo {
    private Save save;

    public Save getSave(){
        return save;
    }

    public void setSave(Save save){
        this.save = save;
    }
}
