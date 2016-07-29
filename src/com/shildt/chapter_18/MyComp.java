package com.shildt.chapter_18;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}
