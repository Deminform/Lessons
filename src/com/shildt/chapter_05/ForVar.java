package com.shildt.chapter_05;

// отдельные части оператора цикла for могут отсутствовать

class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            if (i == 10) done = true;
            i++;
        }
    }
}
