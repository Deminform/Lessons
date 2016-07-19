package com.shildt.glava_06;

// В этом классе объявляется объект типа DoxNewOne

class DoxNewOneDemo {
    public static void main(String[] args) {
        DoxNewOne myDoxNewOne = new DoxNewOne();
        double vol;
        // присвоить значение переменным экземпляра myDoxNewOne
        myDoxNewOne.width = 10;
        myDoxNewOne.height = 20;
        myDoxNewOne.depth = 15;
        // расчитать объем параллелипипеда
        vol = myDoxNewOne.width * myDoxNewOne.height * myDoxNewOne.depth;
        System.out.println("Объем равен " + vol);
    }
}
