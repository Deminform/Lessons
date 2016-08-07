package com.shildt.chapter_11;

public class NewThread_4 implements Runnable {

    String name;
    Thread t;
    boolean suspendFlag;

    NewThread_4(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i=15; i>0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
