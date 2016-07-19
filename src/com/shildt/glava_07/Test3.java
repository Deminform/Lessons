package com.shildt.glava_07;

// Возврат объекта

class Test3 {
    int a;

    Test3(int i) {
        a = i;
    }

    Test3 inrcByTen() {
        Test3 temp = new Test3(a+10);
        return temp;
    }
}
