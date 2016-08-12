package com.tasks.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("First Java position");
        site.addVacancy("Second Java position");

        Observer firstSubscr = new Subscriber("Vova Vetkin");
        Observer secondSubscr = new Subscriber("Lera Suchka");

        site.addObserver(firstSubscr);
        site.addObserver(secondSubscr);

        site.addVacancy("Third Java position");

        site.removeVacancy("First Java position");
    }
}
