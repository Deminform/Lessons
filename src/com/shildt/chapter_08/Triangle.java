package com.shildt.chapter_08;

class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределяем метод для прямоугольного треугольника
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
