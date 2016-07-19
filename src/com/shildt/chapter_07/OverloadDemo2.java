package com.shildt.chapter_07;

// Применить автоматическое преобразование типов к перегрузке

class OverloadDemo2 {
    void test() {
        System.out.println("Parametri otsutsvuut");
    }

    void test(int a, int b) {
        System.out.println("a i b: "+a+" "+b);
    }

    void test(double a) {
        System.out.println("Vnutrennee proobrazovanie pri vizove TEST(double) a: " + a);
    }
}
