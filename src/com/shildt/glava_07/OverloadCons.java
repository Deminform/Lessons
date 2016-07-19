package com.shildt.glava_07;

class OverloadCons {
    public static void main(String[] args) {
        DoxNew mydoxNew1 = new DoxNew(10, 20, 15);
        DoxNew mydoxNew2 = new DoxNew();
        DoxNew mycube = new DoxNew(7);

        double vol;

        vol = mydoxNew1.volume();
        System.out.println("объем mydoxNew1 равен " + vol);

        vol = mydoxNew2.volume();
        System.out.println("объем mydoxNew2 равен " + vol);

        vol = mycube.volume();
        System.out.println("объем mycube равен " + vol);

    }
}
