package com.shildt.chapter_05;

// Применение оператора break в качестве цивилизованной формы оператора goto

class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("этот оператор не будет выполнятся");
                }
                System.out.println("этот оператор не будет выполнятся");
            }
            System.out.println("этот оператор следует за блоком second");
        }
    }
}
