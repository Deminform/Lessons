package com.shildt.glava_10;

class Exc2 {
    public static void main(String[] args) {
        int d;
        int a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль.");
        }
        System.out.println("после оператора catch.");
    }
}
