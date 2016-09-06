package com.tasks.myPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MusicianOrders implements Observed{
    List<String> orders = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addOrder(String order){
        this.orders.add(order);
        notifyObservers();
    }

    public void removeOerder(String order){
        this.orders.remove(order);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers){
            observer.handleEvent(this.orders);
        }
    }
}
