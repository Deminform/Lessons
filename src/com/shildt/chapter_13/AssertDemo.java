package com.shildt.chapter_13;

public class AssertDemo {
    static int val = 3;

    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i=0; i<10; i++) {
            n = getnum();
            assert n > 0 : "отрицательнок!";
            System.out.println("n равно " + n);
        }
    }
}
