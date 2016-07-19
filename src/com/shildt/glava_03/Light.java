package com.shildt.glava_03;

/*
    public class Code_copy {
    byte - 8 от -128 до 127
    short - 16 от -32768 до 32767
    int - 32 от 2147483648 до 2147483647
    long - 64 от -9223372036854775808 до 9223372036854775807

    Выислить расстояние, проходимое светом, используя переменные типа long

*/

class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long second;
        long distance;

        //Приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; // указать количество дней
        second = days * 24 * 60 * 60; // преобразовать в секунды
        distance = lightspeed * second; // вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней, свет пройдет около ");
        System.out.print(distance + " миль.");

    }
}
