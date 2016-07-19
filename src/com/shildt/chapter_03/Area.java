package com.shildt.chapter_03;

// вычислить площадь круга
class  Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус окружности
        pi = 3.116; // приблизительное значение чсла пи
        a = pi * r * r; // вычислить площадь круга
        System.out.println("Площадь круга равна " + a);
    }
}
