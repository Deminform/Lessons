package com.shildt.chapter_06;

class DoxNewOneDemo2 {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne1 = new DoxNewOne();
        DoxNewOne myDoxNewOne2 = new DoxNewOne();
        double vol;

        // присвоить значения переменным
        myDoxNewOne1.width = 10;
        myDoxNewOne1.height = 20;
        myDoxNewOne1.depth = 15;

        // присвоить другие значения переменным экземпляра myDoxNewOne2

        myDoxNewOne2.width = 3;
        myDoxNewOne2.height = 6;
        myDoxNewOne2.depth = 9;

        // расчитать объем первого параллелипипеда

        vol = myDoxNewOne1.width * myDoxNewOne1.height * myDoxNewOne1.depth;
        System.out.println("Объем равен " + vol);

        vol = myDoxNewOne2.width * myDoxNewOne2.height * myDoxNewOne2.depth;
        System.out.println("Объем равен " + vol);
    }
}
