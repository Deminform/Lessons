package com.shildt.glava_06;

// в этой программе применяется метод с параметрами

class DoxNewOneDemo5 {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne1 = new DoxNewOne();
        DoxNewOne myDoxNewOne2 = new DoxNewOne();
        double vol;

        //инициализировать каждый экземпляр класса DoxNewOne
        myDoxNewOne1.setDim(10, 20, 15);
        myDoxNewOne2.setDim(3, 6, 9);

        // получить объем первого параллелепипеда
        vol = myDoxNewOne1.volume();
        System.out.println("Объем равен " + vol);


        // Получить объем второгго параллелепипеда
        vol = myDoxNewOne2.volume();
        System.out.println("Объем равен " + vol);
    }
}
