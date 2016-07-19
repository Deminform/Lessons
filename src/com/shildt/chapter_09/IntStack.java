package com.shildt.chapter_09;

// Определить интерфейс для целочисленного стека

interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("Метод clear() не раелизован.");
    }
}
