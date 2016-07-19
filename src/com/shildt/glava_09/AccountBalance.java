package com.shildt.glava_09;

class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance(" aaaaaaaaaa",  123.23);
        current[1] = new Balance(" bbbbbbbbbb",  157.02);
        current[2] = new Balance(" cccccccccc",  -12.33);

        for (int i=0; i<3; i++) current[i].show();
    }
}
