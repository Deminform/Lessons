package com.shildt.chapter_11;

public class NewThread_1 extends Thread {
    NewThread_1() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    public void run() {
        try {
            for (int i=5; i>0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}
