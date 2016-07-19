package com.shildt.chapter_09;

// Пример вложеноого интерфейса

// Этот класс содержит интерфейс как свой член

class Ainter {
    // это вложеннвый интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
