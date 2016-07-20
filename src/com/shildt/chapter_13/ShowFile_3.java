package com.shildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile_3 {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        try (
                FileInputStream fin = new FileInputStream("test.txt")
        ) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
