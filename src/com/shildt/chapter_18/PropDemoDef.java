package com.shildt.chapter_18;

import java.util.Properties;
import java.util.Set;
import java.util.StringJoiner;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties deflist = new Properties();
        deflist.put("Флорида", "Тэлэси");
        deflist.put("Висконсин", "Мэдисон");

        Properties capitals = new Properties(deflist);

        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        Set<?> states = capitals.keySet();

        for (Object name : states) {
            System.out.println("Столица штат: " + name + " - " + capitals.getProperty((String)name)+".");
        }
        System.out.println();

        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}
