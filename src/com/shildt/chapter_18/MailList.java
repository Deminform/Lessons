package com.shildt.chapter_18;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("A.V. West", "12 Oak Ave", "Varas", "IL", "122122"));
        ml.add(new Address("S.E. West", "13 Oak Ave", "Loste", "IL", "354877"));

        for (Address element : ml) {
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
