package com.shildt.chapter_18;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;

        balance.put("Mark Park", new Double(3434.1));
        balance.put("Salo Bilo", new Double(576.0));
        balance.put("Milo Druki", new Double(477.8));
        balance.put("Ruki Druki", new Double(-52.4));
        balance.put("Mark Jest", new Double(7741.0));

        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        bal = balance.get("Salo Bilo");
        balance.put("Salo Bilo", bal+1000);
        System.out.println("Новый остаток Salo Bilo: "+balance.get("Salo Bilo"));

    }
}
