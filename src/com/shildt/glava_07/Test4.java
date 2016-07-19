package com.shildt.glava_07;

// В этой программе демонстрируется отличие модификаторов public и private

class Test4 {
    int a;
    public int b;
    private int c;

    void setC(int i) {
        c = i;
    }

    int getC() {
        return c;
    }
}