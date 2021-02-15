package com.company;

public class tests {


    public static void main(String[] args) {

        //        Scanner scan = new Scanner(System.in);
        //        String str = scan.next();
        //        sS(str);

        String str = "abcd";
        sS(str);
        System.out.println(sS(str));

        String s = "АДПУ 1";
        String s2 = s.substring(5);
        System.out.println(s);
        System.out.println(s2);
    }


    public static String sS(String str) {
        int x = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<x; i++) {
            sb.append(str, 0, i);
            System.out.println(sb.toString());
        }
        return sb.toString()+str;
    }

}
