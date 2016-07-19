package com.shildt.glava_06;

// Параметризированный конструктор

class DoxNewOneDemo7 {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne1 = new DoxNewOne(10, 20, 15);
        DoxNewOne myDoxNewOne2 = new DoxNewOne(3, 6, 9);

        double vol;

        // получить объем первого параллелепипеда
        vol = myDoxNewOne1.volume();
        System.out.println("Объем равен " + vol);


        // Получить объем второгго параллелепипеда
        vol = myDoxNewOne2.volume();
        System.out.println("Объем равен " + vol);

    }
}
