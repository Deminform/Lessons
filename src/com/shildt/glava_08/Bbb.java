package com.shildt.glava_08;

class Bbb extends Aaa {
    int k;

    Bbb(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println(k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
