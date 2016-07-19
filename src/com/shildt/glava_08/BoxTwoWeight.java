package com.shildt.glava_08;

class BoxTwoWeight extends BoxTwo{
    double weight;

    BoxTwoWeight(BoxTwoWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxTwoWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxTwoWeight() {
        super();
        weight = -1;
    }

    BoxTwoWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
