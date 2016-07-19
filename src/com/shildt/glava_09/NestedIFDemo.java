package com.shildt.glava_09;

class NestedIFDemo {
    public static void main(String[] args) {
        Ainter.NestedIF nif = new Binter();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выполнено");
    }
}
