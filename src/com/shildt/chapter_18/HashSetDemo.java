package com.shildt.chapter_18;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Hamma");
        hs.add("Apsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}
