package com.shildt.glava_06;

/*
Программа, использующая класс DoxNewOne
Присвоить исходному файлу имя DoxNewOneDemo.java
 */

class DoxNewOne {
    double width;
    double height;
    double depth;

    // ввести объем параллелепипеда
//    void volume() {
//        System.out.print("Объем равен ");
//        System.out.println(width*height*depth);
//    }
    DoxNewOne() {
        System.out.println("Конструирование объекта DoxNewOne");
        width = 10;
        height = 10;
        depth = 10;
    }

    DoxNewOne(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width*height*depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
