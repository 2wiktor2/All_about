package com.company.DZHuman;

public class Person implements Human{

    private String name;
    private int age;
   private String gender;



    @Override
    public void getName() {
        System.out.println("Имя - " + name);

    }

    @Override
    public void getAge() {
        System.out.println("Возраст  - " + age);

    }

    @Override
    public void getGender() {
        System.out.println("Пол - "+ gender);

    }
}
