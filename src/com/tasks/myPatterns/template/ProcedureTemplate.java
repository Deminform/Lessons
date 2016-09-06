package com.tasks.myPatterns.template;

public abstract class ProcedureTemplate {
    public void sequence(){
        System.out.println("She comes to the studio");
        ownAction();
        System.out.println("Play music");
    }

    public abstract void ownAction();
}
