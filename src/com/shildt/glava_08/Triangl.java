package com.shildt.glava_08;

class Triangl extends Figur {

    Triangl(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
