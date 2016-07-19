package com.shildt.chapter_05;

// продемонстрировать применение оператора цикла do-while

class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (n > 0);
    }
}
