package com.shildt.chapter_08;

class Dispatch {
    public static void main(String[] args) {
        Aaaa a = new Aaaa();
        Bbbb b = new Bbbb();
        Cccc c = new Cccc();

        Aaaa r;
        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
