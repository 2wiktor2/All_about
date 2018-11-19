package com.company;

public class AllAboutStringBuilder {
    public static void main(String[] args) {

        //Класс StringBuilder идентичен классу StringBuffer и обладает большей производительностью.
        // Однако он не синхронизирован, поэтому его не нужно использовать в тех случаях,
        // когда к изменяемой строке обращаются несколько потоков.

        // Создание!


        StringBuilder sb1 = new StringBuilder();


        String string1 = "Wiktor";
        char ch1 = 'Z';


        //Добавление

        sb1.append('X');  // Добавить символ
        sb1.append(ch1);  // Добавить символ



    }
}
