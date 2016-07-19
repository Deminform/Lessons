package com.shildt.glava_07;

class TsetStack2 {
    public static void main(String[] args) {
        Stack3 mysctack1 = new Stack3(5);
        Stack3 mysctack2 = new Stack3(8);

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
