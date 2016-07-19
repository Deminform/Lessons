package com.shildt.chapter_08;

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    // переопределяем метод для четырехугольника
    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
