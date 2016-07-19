package com.shildt.chapter_08;

class Btest extends Atest {
    int i;

    Btest(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}