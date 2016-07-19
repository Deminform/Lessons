package com.shildt.glava_05;

// Целевая часть цикла может быть пустой

class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // расчитать среднее значение переменных i и j
        while (++i < --j); // у этого цикла отсутствует тело
        System.out.println("Среденее значение равно " + i);
    }
}
