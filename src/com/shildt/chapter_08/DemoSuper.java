package com.shildt.chapter_08;

class DemoSuper {
    public static void main(String[] args) {
        BoxTwoWeight mybox1 = new BoxTwoWeight(10, 20, 15, 34.3);
        BoxTwoWeight mybox2 = new BoxTwoWeight(2, 3, 4, 0.076);
        BoxTwoWeight mybox3 = new BoxTwoWeight();
        BoxTwoWeight mycube = new BoxTwoWeight(3, 2);
        BoxTwoWeight myclone = new BoxTwoWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

    }
}
