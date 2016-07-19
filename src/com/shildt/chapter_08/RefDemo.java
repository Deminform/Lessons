package com.shildt.chapter_08;

class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxweight = new BoxWeight(3, 5, 7, 8.37);
        Box box = new Box();
        double vol;

        vol = boxweight.volume();
        System.out.println("объем boxweight равен " +vol);
        System.out.println("Вес boxweight равен " + boxweight.weight);
        System.out.println();

        // Присвоить ссылке на объект BoxWeight ссылки на объект Box
        box = boxweight;
        vol = box.volume(); // Верно т.к. метод volume() определен в лкассе Box
        System.out.println("Объем box равен " + vol);

        // ОШИБКА ! System.out.println("Вес box равен " + box.weight);
    }
}

