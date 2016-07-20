package com.shildt.chapter_13;

public class MyClass_2 {
    int a;
    int b;

    MyClass_2(int i, int j) {
        a = i;
        b = j;
    }

    MyClass_2(int i) {
        this(i, i);
    }

    MyClass_2() {
        this(0);
    }
}
