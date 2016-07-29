package com.shildt.chapter_18;

import java.util.Comparator;

public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i;
        int j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
