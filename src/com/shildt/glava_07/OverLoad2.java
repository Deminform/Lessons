package com.shildt.glava_07;

class OverLoad2 {
    public static void main(String[] args) {
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test(123.2);
    }
}
