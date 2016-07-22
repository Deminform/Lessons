package com.shildt.chapter_18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        System.out.println("Содержимое массива: "+ a1);

        Integer ia[] = new Integer[a1.size()];
        ia = a1.toArray(ia);

        int sum = 0;

        for (int i : ia) {
            sum += i;
        }
        System.out.println("Сумма: " + sum);
    }
}
