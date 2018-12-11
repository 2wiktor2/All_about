package com.company;

import java.awt.*;
import java.util.ArrayList;

public class AllAboutList {
    public static void main(String[] args) {

        List list = new List();

        ArrayList<String> arrayL = new ArrayList<String>(3);


        //Добавление элементов
        arrayL.add("Hi");
        arrayL.add("Hello");
        arrayL.add("Ciao");
        arrayL.add("Hola");
        arrayL.add("Привет");
        arrayL.add("Hey!");
        arrayL.add("This");
        arrayL.add("is");
        arrayL.add("my");
        arrayL.add("first");
        arrayL.add("list!");
        arrayL.add("Merhaba");
        arrayL.add("Aloha");
        arrayL.add("Гамарджоба");

        // Добавление в середину списка
        arrayL.add(3, "Дратути");

        // Удаление из списка
        arrayL.remove(1);    // Удаление по индексу
        arrayL.remove("Hola");   // Удаление по значению т.е. по ссылке

        // получить элемент из списка
        arrayL.get(8);
        System.out.println("получить элемент из списка  "+ arrayL.get(8));

        // получить индекс элемента списка
        arrayL.indexOf("Гамарджоба");
        System.out.println("получить индекс элемента списка  "+arrayL.indexOf("Гамарджоба"));

        // Заменить элемент списка другим элементом
        arrayL.set(7, "Zhopa новый элемент спискаЛ");


        //Размер списка
        System.out.println("Размер массива = " + arrayL.size());

        // Вывод всего списка
        System.out.println(arrayL.toString());

        // Проверить соделжит ли список элемент
        arrayL.contains("Привет");  // true
        System.out.println(arrayL.contains("Привет"));

        // Проход по списку

        for (int i =0; i<arrayL.size(); i++){
            System.out.println("Проход по списку for "+arrayL.get(i));
        }




    }
}



