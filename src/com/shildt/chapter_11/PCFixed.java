package com.shildt.chapter_11;

public class PCFixed {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        new Produce(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
