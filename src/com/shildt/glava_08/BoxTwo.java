package com.shildt.glava_08;

class BoxTwo {
    private double width;
    private double height;
    private double depth;

    BoxTwo(BoxTwo ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxTwo(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxTwo() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxTwo(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width*height*depth;
    }
}
