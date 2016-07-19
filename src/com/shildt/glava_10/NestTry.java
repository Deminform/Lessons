package com.shildt.glava_10;

class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);

            try {
                if (a==1) {
                    a = a/(a-a);
                }
                if (a==2) {
                    int c[] = {1};
                    c[42] = 99; // здесь генерируется исключение в свзяи с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределеавми массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
    }
}
