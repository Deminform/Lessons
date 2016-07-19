package com.shildt.glava_09;

//простой пакет

// package MyPack

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal<0) {
            System.out.printf("-->");
        }
        System.out.println(name + ": $" + bal);
    }
}
