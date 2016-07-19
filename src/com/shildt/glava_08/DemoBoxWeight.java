package com.shildt.glava_08;

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 hfdty " + mybox1.weight);;
        System.out.println();

        vol = mybox2.volume();
        System.out.println("объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 hfdty " + mybox2.weight);;
    }
}
