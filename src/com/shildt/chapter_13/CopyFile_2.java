package com.shildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile_2 {
    public static void main(String[] args) {
        int i;
        if (args.length != 2) {
            System.out.println("Использование: CopyFile test.txt и out.txt");
            return;
        }

        try (
                FileInputStream fin = new FileInputStream("test.txt");
                FileOutputStream fout = new FileOutputStream("out.txt")
                ) {
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
