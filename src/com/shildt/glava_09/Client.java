package com.shildt.glava_09;

class Client implements Callback {

    //Реализовать интерфейс Callback

    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены");
    }
}
