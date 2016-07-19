package com.shildt.chapter_07;

class TestStack2 {
    public static void main(String[] args) {
        Stack2 mysctack1 = new Stack2();
        Stack2 mysctack2 = new Stack2();

        for (int i=0; i<10; i++) mysctack1.push(i);
        for (int i=10; i<20; i++) mysctack2.push(i);

        System.out.println("Sctack в mystack1: ");
        for (int i=0; i<10; i++)
            System.out.println(mysctack1.pop());

        System.out.println("Sctack в mystack2: ");
        for (int i=0; i<10; i++)
            System.out.println(mysctack2.pop());

    }
}