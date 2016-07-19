package com.shildt.chapter_07;

// Определить внутренний класс в цикле for

class Outher1 {
    int outer_x = 100;

    void test() {
        for (int i=0; i<10; i++) {
            class Inner {
                void display() {
                    System.out.println("Вывод: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
