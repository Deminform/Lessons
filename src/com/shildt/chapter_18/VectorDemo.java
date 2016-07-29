package com.shildt.chapter_18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3,2);
        System.out.println("Начальный размер вектора: " + v.size());
        System.out.println("Начальная емкость вектора: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Емкость ветора после воода элементов: " + v.capacity());
        v.addElement(5);
        System.out.println("Емкость ветора: " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("Емкость ветора: " + v.capacity());

        v.addElement(9);
        v.addElement(10);
        System.out.println("Емкость ветора: " + v.capacity());

        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент ветора: " + v.firstElement());

        System.out.println("Последний элемент ветора: " + v.lastElement());

        if (v.contains(3))
            System.out.println("Вектор содержит 3.");

        Enumeration<Integer> vEnum = v.elements();

        System.out.println("\n Элементы вектора: ");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();


    }
}
