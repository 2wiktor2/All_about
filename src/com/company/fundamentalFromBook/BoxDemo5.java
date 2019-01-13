package com.company.fundamentalFromBook;

public class BoxDemo5 {
    public static void main(String[] args) {

      /*  Как видите, метод setDim ( ) использован для установки размеров каждого параллелепипеда.
        Например, при выполнении следующей строки кода:
        myboxl.setDim( l O , 2 0 , 1 5 ) ;
        значение 10 копируется в параметр w, значение 20 - в параметр h , а значение 15 -
                в параметр d. Затем в теле метода setDim( ) значения параметров w, h и d присваиваются
        переменным width , height и depth соответственно.

        */

        double vol;
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.setDim(1, 2, 4);
        myBox2.setDim(2, 3, 1.5);

        vol = myBox1.volume2();
        System.out.println(vol);
        vol = myBox2.volume2();
        System.out.println(vol);
    }
}
