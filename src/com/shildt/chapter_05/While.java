package com.shildt.chapter_05;

// продемонстрировать применение оператора цикла while

class While {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
