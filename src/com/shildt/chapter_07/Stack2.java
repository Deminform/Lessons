package com.shildt.chapter_07;

// в этом классе определяется целочитсленный стек, который может содержать 10 значений

class Stack2 {
    private int stck[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    Stack2() {
        tos = -1;
    }

    // Разместить элемент в стеке
    void push(int item) {
        if (tos==9) {
            System.out.println("Стек заполнен.");
        } else
            stck[++tos] = item;
    }

    // Извелчь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stck[tos--];
    }
}
