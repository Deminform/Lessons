package com.shildt.chapter_11;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread_4 ob1 = new NewThread_4("Один");
        NewThread_4 ob2 = new NewThread_4("Два");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока "+Thread.currentThread().getName());
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока "+Thread.currentThread().getName());
            ob2.mysuspend();
            System.out.println("Приостановка потока "+Thread.currentThread().getName());
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завршен");
    }
}
