package com.shildt.chapter_09;

// Класс В реализует вложенный интерфейс

class Binter implements Ainter.NestedIF {

    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}


