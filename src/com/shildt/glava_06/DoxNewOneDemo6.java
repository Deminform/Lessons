package com.shildt.glava_06;

//В данном примере используется конструктор

class DoxNewOneDemo6 {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne1 = new DoxNewOne();
        DoxNewOne myDoxNewOne2 = new DoxNewOne();

        double vol;

        // получить объем первого параллелепипеда
        vol = myDoxNewOne1.volume();
        System.out.println("Объем равен " + vol);


        // Получить объем второгго параллелепипеда
        vol = myDoxNewOne2.volume();
        System.out.println("Объем равен " + vol);

    }
}
