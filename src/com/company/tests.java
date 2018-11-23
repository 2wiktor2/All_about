package com.company;

public class tests {
    public static void main(String[] args) {
        int n = 7;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println("i = " + i + "  " + "fact = " + fact);
        }


        String a = "Heeeelleo";
        int x1 = a.length();
        System.out.println(a);
        System.out.println("Длина вводной строки равна " + x1);

        String b = a.replace("e", "");
        int x2 = b.length();
        System.out.println("Длина  строки b после изменения равна " + x2);
        System.out.println(b);
        int y = x1 - x2;
        System.out.println(y);

    }
}
