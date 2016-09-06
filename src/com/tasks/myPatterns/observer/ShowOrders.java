package com.tasks.myPatterns.observer;

public class ShowOrders {
    public static void main(String[] args) {
        MusicianOrders orders = new MusicianOrders();

        orders.addOrder("First order for guitarist");
        orders.addOrder("Second order for pianist");

        Observer firstSub = new Subscriber("Guitarist Vanya");
        Observer secondSub = new Subscriber("Pianist Petya");

        orders.addObserver(firstSub);
        orders.addObserver(secondSub);

        orders.addOrder("Third order for guitarist");

        orders.removeOerder("First order for guitarist");
    }
}
