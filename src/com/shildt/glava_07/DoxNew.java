package com.shildt.glava_07;

class DoxNew {
    double width;
    double height;
    double depth;

    DoxNew(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    DoxNew() {
        width = -1;
        height = -1;
        depth = -1;
    }

    DoxNew(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

    DoxNew(DoxNew ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
}
