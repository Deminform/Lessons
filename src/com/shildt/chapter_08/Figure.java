package com.shildt.chapter_08;

// Применение переопределения методов

// Применение полиморфизма во время выполнения

class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Пощадь фигуры не определена.");
        return 0;
    }
}
