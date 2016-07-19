package com.shildt.chapter_07;

// Аругменты переменной длинны и перегрузка
class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int... v): " + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean... v): " + v.length + " Содержимое: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();

    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String msg, int... v): " + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }
}