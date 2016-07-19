package com.shildt.glava_07;

// Применение некоторых методов из класса String

class StringDemo2 {
    public static void main(String[] args) {
        String str1 = "Первая строка";
        String str2 = "Вторая строка";
        String str3 = str1;

        System.out.println("Длинна строки str1: " + str1.length());

        System.out.println("Символ по индексу 3 в строке str1: " + str1.charAt(3));

        if (str1.equals(str2))
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");

        if (str1.equals(str3))
            System.out.println("str1 == str3");
        else
            System.out.println("str1 != str3");

    }
}
