package com.shildt.chapter_11;

import com.shildt.chapter_18.TreeMapDemo;

public class PC {
    public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        new Produce(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
