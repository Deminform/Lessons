package com.shildt.glava_08;

class AbstractArea {
    public static void main(String[] args) {
        Rectangl r = new Rectangl(10, 10);
        Triangl t = new Triangl(9, 5);
        Figur figur;

        figur = r;
        System.out.println("Площадь равна " + figur.area());

        figur = t;
        System.out.println("Площадь равна " + figur.area());
    }
}
