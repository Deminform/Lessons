package com.shildt.chapter_11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i=5; i>0; i--) {
                System.out.println("Главный поток: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Гланый поток завершен.");
    }
}
