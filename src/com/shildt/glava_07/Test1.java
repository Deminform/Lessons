package com.shildt.glava_07;

//Объекты допускается передавать методам в качестве параметров

class Test1 {
    int a, b;
    Test1(int i, int j) {
        a = i;
        b = j;
    }

    Test1() {
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test1 o) {
        o.a *= 2;
        o.b /= 2;
    }

    // Возвратить логическое значение true, если в качестве параметра о указан вызывающий объект
    boolean equals(Test1 o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
