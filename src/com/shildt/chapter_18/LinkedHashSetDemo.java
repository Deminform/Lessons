package com.shildt.chapter_18;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Hamma");
        hs.add("Apsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
