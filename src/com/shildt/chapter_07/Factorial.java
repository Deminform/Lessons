package com.shildt.chapter_07;

// Простой тест рекурсии

class Factorial {
    int fact(int n) {
        int result;

        if (n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}