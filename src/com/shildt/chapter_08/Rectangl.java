package com.shildt.chapter_08;

class Rectangl extends Figur {

    Rectangl(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("В области четырехугольника");
        return dim1 * dim2;
    }
}
