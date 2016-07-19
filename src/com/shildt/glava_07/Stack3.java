package com.shildt.glava_07;

// усовершенстваованный класс Stack, в котором использован член длинны массива

class Stack3 {
    private int stck[];
    private int tos;

    Stack3(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos==stck.length-1)
            System.out.println("Стек заполнен");
        else stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else
            return stck[tos--];
    }
}
