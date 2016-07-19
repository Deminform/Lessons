package com.shildt.glava_07;

class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100); // доступ только через сеттер потому что переменная в привате

        System.out.println("a, b, и c:" + ob.a + " " + ob.b + " " + ob.getC());
    }
}
