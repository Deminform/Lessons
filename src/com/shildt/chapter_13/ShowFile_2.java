package com.shildt.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile_2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //Сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile test.txt");
            return;
        }

        /*
        В следующем код, сначала открывается файл,
        а затем из него читаются символы до тех пор, пока не встрется
        признак конца файла
         */

        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода вывода");
        } finally {
            // Закрыть файл в любом случае
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

    }
}
