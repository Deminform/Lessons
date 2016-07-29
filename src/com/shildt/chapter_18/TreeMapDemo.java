package com.shildt.chapter_18;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Mark Park", new Double(3434.1));
        tm.put("Salo bilo", new Double(576.0));
        tm.put("Milo Est", new Double(477.8));
        tm.put("Ruki Druki", new Double(-52.4));
        tm.put("Kruki Jest", new Double(7741.0));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = tm.get("Mark Park");
        tm.put("Mark Park", balance + 1000);
        System.out.println("Новый баланс Mark Park: " + tm.get("Mark Park"));
    }
}
