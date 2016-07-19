package com.shildt.chapter_06;

// Класс это логическая конструкция определящая взаимосвязь между его объектами

class DoxNewOneDemo3 {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne1 = new DoxNewOne();
        DoxNewOne myDoxNewOne2 = new DoxNewOne();

        //присвоить значение переменным экземпляра myDoxNewOne1
        myDoxNewOne1.width = 10;
        myDoxNewOne1.height = 20;
        myDoxNewOne1.depth = 15;
        //присвоить значение переменным экземпляра myDoxNewOne2
        myDoxNewOne2.width = 3;
        myDoxNewOne2.height = 6;
        myDoxNewOne2.depth = 9;


        // Вывести объем первого параллелепипеда
        myDoxNewOne1.volume();

        // Вывести объем второгго параллелепипеда
        myDoxNewOne2.volume();
    }
}
