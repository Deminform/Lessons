package com.shildt.glava_13;

// -------------------------------------------------------------------------------------
// ------------------------- Класс потоков ввода-вывода БАЙТОВ ---------------------------------
// -------------------------------------------------------------------------------------

import java.io.*;

class Classes {
    public static void main(String[] args) {
        BufferedInputStream bis;         // Буферизированный поток ввода
        BufferedOutputStream bos;        // Буферизированный поток вывода
        ByteArrayInputStream bais;       // Поток ввода, читающий байты из массива
        ByteArrayOutputStream baos;      // Поток вывода, записывающий байты в массив
        DataInputStream dis;             // Поток ввода, содержащий методы для чтения данных стандартных типов, определенных в Java
        DataOutputStream dos;            // Поток вывода, содержащий методы для чтения данных стандартных типов, определенных в Java
        FileInputStream fis;             // Поток ввода, читающий данные из файла
        FileOutputStream fos;            // Поток вывода, записывающий данные в файл
        FilterInputStream filtrs;        // Реализует абстрактный класс InputStream
        FilterOutputStream filtos;       // Реализует абстрактный класс OutputStream
        InputStream is;                  // Абстрактный класс, описывающий поток ввода
        OutputStream os;                 // Абстрактный класс, описывающий поток вывода
        ObjectInputStream ois;           // Поток ввода объектов
        ObjectOutputStream oos;          // Поток вывода объектов
        PipedInputStream pis;            // Канал ввода
        PipedOutputStream pos;           // Канал вывода
        PrintStream ps;                  // Поток вывода содержащий методы print() и println()
        PushbackInputStream puis;        // Поток ввода, поддерживающий возврат одного байта обратно в поток ввода
        SequenceInputStream sqis;        // Поток ввода, состоящий из вуд и более потоков ввода, данные из которых читаются по очереди


// -------------------------------------------------------------------------------------
// ------------------------- Класс потоков ввода-вывода СИМВОЛОВ ---------------------------------
// -------------------------------------------------------------------------------------


        BufferedReader bf;              // Буферизированный поток ввода сиволов
        BufferedWriter bw;              // Буферизированный поток вывода сиволов
        CharArrayReader car;            // Поток ввода, читающий символы из массива
        CharArrayWriter caw;            // Поток вывода, записывающий символы в массив
        FileReader fr;                  // Поток ввода, читающий символы из файла
        FileWriter fw;                  // Поток вывода, записывающий символы в файл
        FilterReader filtrr;            // Фильтрованный поток чтения
        FilterWriter filtrw;            // Фильтрованный поток записи
        InputStreamReader isr;          // Поток ввода, преобразующий байты в символы
        OutputStreamWriter osw;         // Поток вывода, преобразующий символы в байты
        LineNumberReader lnr;           // Поток ввода, подсчитывающий строки
        PipedReader pir;                // Канал ввода
        PipedWriter piw;                // Канал вывода
        PrintWriter pw;                 // Поток вывода, содержащий методы print() и println()
        PushbackReader pbr;             // Поток ввода, позволяющий возвращать символы обратно в поток ввода
        Reader r;                       // Абстрактный класс, описывающий поток ввода символов
        Writer w;                       // Абстрактный класс, описывающий поток вывода символов
        StringReader sr;                // Поток ввода, читающий символы из строки
        StringWriter sw;                // Поток вывода, записывающий символы в строку

    }
}

