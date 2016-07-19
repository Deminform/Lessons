package com.shildt.glava_10;

// Обработать исключение и продолжить работу

import java.util.Random;

class HandleError {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random r = new Random();

        for (int i=0; i<32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                System.out.println("деление на ноль.");
                a = 0; // присвоить ноль и продолжить работу
            }
            System.out.println("а: " + a);
        }
    }
}
