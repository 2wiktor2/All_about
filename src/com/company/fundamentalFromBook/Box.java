package com.company.fundamentalFromBook;


public class Box {

    double width;
    double height;
    double depth;


    //Конструкторы
    // конструктор по умолчанию

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //параметризированный конструктор
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор для создания куба
    Box(double len) {
        width = height = depth = len;
    }

    // передать объект конструктору
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // вывести объем параллелепипеда
    void volume1() {
        System.out.print("Volume = ");
        System.out.println(width * height * depth);
    }

    // метод возвращающий значение
    double volume2() {
        return width * height * depth;
    }

    // Установить размеры параллелепипеда через метод
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }
}

