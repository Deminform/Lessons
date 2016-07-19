package com.shildt.glava_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRRead {
    public static void main(String[] args) throws IOException, InterruptedException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода.");

        do {
            c = (char) br.read();
            System.out.println(c);
            Thread.sleep(100);
        } while (c != 'q');
    }
}

