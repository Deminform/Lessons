package com.shildt.chapter_08;

// Применение абстрактных классов

abstract class Q {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конкретный метод");
    }
}
