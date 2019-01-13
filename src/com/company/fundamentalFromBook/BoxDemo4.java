package com.company.fundamentalFromBook;

public class BoxDemo4 {
    public static void main(String[] args) {

        double vol;

        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 1;
        myBox1.height = 2;
        myBox1.depth = 3;

        myBox2.width = 2;
        myBox2.height = 4;
        myBox2.depth = 6;

        vol = myBox1.volume2();
        System.out.println("volume = "+vol);
        vol = myBox2.volume2();
        System.out.println("volume = "+vol);


    }

}
