package com.company.DZHuman;

public class Man implements Human {
    private String name;
    private int age;
    private final String gender = "Мужской";
    private Person person;


    // конструктор
    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setWife(Person a){
        a.getName();
        a.getAge();
        a.getGender();
    }


    @Override
    public void getName() {
        System.out.println("Имя мужчины - " + name);
    }

    @Override
    public void getAge() {
        System.out.println("Возраст мужчины - " + age);
    }

    @Override
    public void getGender() {
        System.out.println("Пол - "+ gender);
    }
}
