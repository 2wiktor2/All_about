package com.company.interfaces;

public class Test {
    public static void main(String[] args) {

        Animal animal1= new Animal(1);
        Person person1 = new Person("Имя1");

   /*     animal1.sleep();
        person1.sayHello();
        person1.showInfo();
        animal1.showInfo();*/

        // Переменная типа Info ссылается на объект класса Animal потому, что класс Animal реализует интерфейс Info

        // Сужаем методы Animal до методов Info
        //        не работают все методы из класса Animal
        //                остаются только методы интерфейса Info
        Info info1 = new Animal(2);
        Info info2 = new Person("Name2");

        info1.showInfo();

        // Расширяем обратно
        ((Animal) info1).sleep();

        info2.showInfo();
        ((Person) info2).sayHello();


        outputInfo(info1);
        outputInfo(info2);

        outputInfo(animal1);
        outputInfo(person1);

    }
// на вход приходит нечто что реализует интерфейс Info
    public static void outputInfo(Info info) {
        // у этого нечто мы можем вызвать методы
        // в данном случае только те методы которые есть в интерфейсе Info
        info.showInfo();

    }
}
