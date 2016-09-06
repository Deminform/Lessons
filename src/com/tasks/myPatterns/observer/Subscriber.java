package com.tasks.myPatterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> orders) {
        System.out.println("Dear " + name + "\nWe have some orders for you!\n" + orders +
                "\n==============================================\n");
    }
}
