package com.shildt.chapter_07;

// Вывести все аргумненты командной строки

class CommandLine {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);

    }
}
