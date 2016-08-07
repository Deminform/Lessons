package com.shildt.chapter_11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread_2("Один");
        new NewThread_2("Два");
        new NewThread_2("Три");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
