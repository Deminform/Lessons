package com.tasks.myPatterns.strategy;

public class Musician {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
