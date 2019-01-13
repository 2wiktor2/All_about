package com.company.fundamentalFromBook;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width =1;
        myBox1.height =2;
        myBox1.depth =3;

        myBox2.width =2;
        myBox2.height =4;
        myBox2.depth =6;

        myBox1.volume1();
        myBox2.volume1();
    }
}
