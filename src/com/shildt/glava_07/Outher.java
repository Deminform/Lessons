package com.shildt.glava_07;

// Продемонстрировать применение внутреннего класса

class Outher {
    int outher_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("Вывод: outher_x = " + outher_x);
        }
    }
}
