package com.shildt.glava_05;

// применение цикла for в стиле for each

class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // использовать ицкл в стиле for each для вывода и суммирования значений
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма равно: " + sum);
    }
}
