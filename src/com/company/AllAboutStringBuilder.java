package com.company;

public class AllAboutStringBuilder {
    public static void main(String[] args) {

        //Класс StringBuilder идентичен классу StringBuffer и обладает большей производительностью.
        // Однако он не синхронизирован, поэтому его не нужно использовать в тех случаях,
        // когда к изменяемой строке обращаются несколько потоков.

        // Создание!


        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Text, text.");


        String string1 = "Wiktor";
        char ch1 = 'Z';


        //Добавление

        sb1.append('X');  // Добавить символ
        sb1.append(ch1);  // Добавить символ
        sb1.append("Hello world"); // Добавить строку
        sb1.append(string1); // Добавить строку



       // результирующая строка

        String completedString = sb1.toString();

        System.out.println("sb1 = "+sb1);  //  sb1 = XZHello worldWiktor
        System.out.println("sb2 = "+sb2);  //  sb2 = Text, text.
        System.out.println("completedString = "+completedString); //  completedString = XZHello worldWiktor


        //  Соединять строки можно цепочкой.

       StringBuilder sb3 = new StringBuilder("Wiktor").append(' ').append('t').append("he").append(' ').append("number ").append(1);

        System.out.println("sb3 = "+ sb3); // sb3 = Wiktor the number1


    }
}
