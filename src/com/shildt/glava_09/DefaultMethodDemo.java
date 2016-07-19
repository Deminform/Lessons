package com.shildt.glava_09;

// Использовать метод по умолчанию


class DefaultMethodDemo {
    public static void main(String[] args) {

        //Метод getNumber() можно вызвать, т.к. он явно реализован в классе MyIFmp
        MyIFmp ob = new MyIFmp();
        System.out.println(ob.getNumber());

        //Метод getString так же можно вызвать, т.к. в интерфейсе имеется его реализация по умолчанию:
        System.out.println(ob.getString());
    }
}
