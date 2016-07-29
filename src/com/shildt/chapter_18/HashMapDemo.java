package com.shildt.chapter_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Дон Сноу", new Double(3434.3));
        hm.put("Лара Крофт", new Double(1123.6));
        hm.put("Мишель лу", new Double(457.8));
        hm.put("Ваня Ку", new Double(6882.2));
        hm.put("Мафа Ли", new Double(742.0));
        hm.put("Дур Дом", new Double(-985.08));

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = hm.get("Дон Сноу");
        hm.put("Дон Сноу", balance + 1000);
        System.out.println("Новый остаток на счете Дона Сноу: " + hm.get("Дон Сноу"));
    }
}
