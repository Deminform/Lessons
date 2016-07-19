package com.shildt.glava_08;

// Применение абстрактных метов и классов
abstract class Figur {
    double dim1;
    double dim2;
    Figur(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
