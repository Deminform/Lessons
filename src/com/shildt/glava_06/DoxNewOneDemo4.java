package com.shildt.glava_06;

// Теперь метод volume() возвращает объем параллелепипеда

class DoxNewOneDemo4 {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne1 = new DoxNewOne();
        DoxNewOne myDoxNewOne2 = new DoxNewOne();
        double vol;

        //присвоить значение переменным экземпляра myDoxNewOne1
        myDoxNewOne1.width = 10;
        myDoxNewOne1.height = 20;
        myDoxNewOne1.depth = 15;
        //присвоить значение переменным экземпляра myDoxNewOne2
        myDoxNewOne2.width = 3;
        myDoxNewOne2.height = 6;
        myDoxNewOne2.depth = 9;

        // получить объем первого параллелепипеда
        vol = myDoxNewOne1.volume();
        System.out.println("Объем равен " + vol);


        // Получить объем второгго параллелепипеда
        vol = myDoxNewOne2.volume();
        System.out.println("Объем равен " + vol);
    }
}
