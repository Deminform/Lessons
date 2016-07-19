package com.shildt.glava_05;

// Поиск в массиве с применение цикла for в стиле for each

class Search {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int vsl = 5;
        boolean found = false;

        //использовать цикл for в стиле for each для поиска значения переменноц vsl в массиве nums

        for (int x : nums) {
            if (x == vsl) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");
    }
}
