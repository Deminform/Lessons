package com.shildt.glava_08;

// Расширяем класс Box добалвяя в него свойство цвета

class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
