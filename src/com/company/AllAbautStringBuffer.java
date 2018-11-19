package com.company;

public class AllAbautStringBuffer {
    public static void main(String[] args) {


        //Создание.Создание.Создание.Создание.Создание.Создание.Создание.Создание.

        String string1 = "WIKTOR222";

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Viktor"); // С изначально заданной строкой
        StringBuffer sb3 = new StringBuffer(string1);  // С изначально заданной строкой

        System.out.println("sb1 = " + sb1); // sb1 =
        System.out.println("sb2 = " + sb2); //sb2 = Viktor
        System.out.println("sb3 = " + sb3); //sb3 = WIKTOR222


// Превратить SStringBuffer в String
        String strFina5 = String.valueOf(sb2);
        // или
        String strFinal = "" + sb2;


        //получить длину объекта (int)
        int l1 = sb2.length();
        System.out.println(l1); //6

        //Извлечь значение символа из строки
        sb2.charAt(0);
        sb2.charAt(1);
        sb2.charAt(2);
        sb2.charAt(3);
        sb2.charAt(4);
        sb2.charAt(5);
        String string2 = "" + sb2.charAt(0) + sb2.charAt(1) + sb2.charAt(2) + sb2.charAt(3) + sb2.charAt(4) + sb2.charAt(5);
        System.out.println(string2); // Viktor

        // Добавление
        sb1.append(string1).append(777).append(l1).append(sb3).append(sb2.charAt(2)); // или можно записать в столбик
        System.out.println(sb1); //WIKTOR2227776WIKTOR222k

        //Вставка в строку новой строки или символа
        sb2.insert(6, " Hello");
        System.out.println(sb2); // Viktor Hello

        //реверс
        sb2.reverse();
        System.out.println(sb2); //olleH rotkiV

        //Удаление символа или куска строки
        StringBuffer sb4 = new StringBuffer("ВикторВиктор");
        sb4.length();
        System.out.println(sb4.length()); //12
        sb4.deleteCharAt(10);
        sb4.deleteCharAt(6);
        System.out.println(sb4); //Викториктр
        sb4.delete(6, 10);
        System.out.println(sb4); //Виктор

        //Вставка , замена
        System.out.println(sb2.reverse());             // Viktor Hello
        sb2.replace(2, 8, "VIKTOR");
        System.out.println(sb2);                        // ViVIKTORello




    }
}
