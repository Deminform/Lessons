package com.shildt.chapter_11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread_3 ob1 = new NewThread_3("Один");
        NewThread_3 ob2 = new NewThread_3("Два");
        NewThread_3 ob3 = new NewThread_3("Три");

        System.out.println("Поток Один Запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два Запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три Запущен: " + ob3.t.isAlive());

        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток Один Запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два Запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три Запущен: " + ob3.t.isAlive());

        System.out.println("Главный поток завершен.");
    }
}
