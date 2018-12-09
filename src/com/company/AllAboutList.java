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

        // Добавление в середину списка
        arrayL.add(3, "Дратути");



//        Размер списка
        System.out.println(arrayL.size());


    }
}



