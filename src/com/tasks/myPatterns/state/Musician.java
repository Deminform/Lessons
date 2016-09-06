package com.tasks.myPatterns.state;

public class Musician {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleep){
            setActivity(new Trainig());
        }else if (activity instanceof Trainig){
            setActivity(new ToCompose());
        }else if (activity instanceof ToCompose){
            setActivity(new PlayMusic());
        }else if (activity instanceof PlayMusic){
            setActivity(new Sleep());
        }
    }

    public void justDoIt(){
        activity.justDoIt();
    }
}
