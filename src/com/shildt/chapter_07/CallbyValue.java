package com.shildt.chapter_07;

// Аргументы примитивных типов передаются по значению


class CallbyValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        int a = 15, b = 20;
        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
