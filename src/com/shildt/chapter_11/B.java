package com.shildt.chapter_11;

public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс В прерван");
        }
        System.out.println(name + " пытается вызвать мето A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("В методе A.last()");
    }
}
