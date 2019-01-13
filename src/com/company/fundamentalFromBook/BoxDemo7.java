package com.company.fundamentalFromBook;

public class BoxDemo7 {
    public static void main(String[] args) {

        double vol;
        Box myBox1 = new Box(1, 2, 3);
        Box myBox2 = new Box(10.2, 1.6, 2);
        Box myCube = new Box(7);

        Box myClone = new Box(myBox1);

        vol = myBox1.volume2();
        System.out.println(vol);
        vol = myBox2.volume2();
        System.out.println(vol);
        vol = myCube.volume2();
        System.out.println(vol);
        vol = myClone.volume2();
        System.out.println(vol);



    }
}
