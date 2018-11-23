package com.company;

public class AllAboutString {
    public static void main(String[] args) {


        String a = "Heeeelleo";
        int x1 = a.length();
        System.out.println(a);
        System.out.println("Длина вводной строки равна " + x1);

        String b = a.replace("e", "");
        int x2 = b.length();
        System.out.println("Длина  строки b после изменения равна " + x2);
        System.out.println(b);
        int y =x1 -x2;
        System.out.println(y);



    }
}
