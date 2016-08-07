package com.shildt.chapter_11;

public class Produce implements Runnable {
    Q q;

    Produce(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
