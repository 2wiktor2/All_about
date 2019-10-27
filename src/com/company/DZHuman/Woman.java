package com.company.DZHuman;

public class Woman implements Human {
    private String name;
    private int age;
    private final String gender = Const.W;

    Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void getName() {
        System.out.println("Имя женщины - " + name);
    }

    @Override
    public void getAge() {
        System.out.println("Возраст женщины - " + age);
    }

    @Override
    public void getGender() {
        System.out.println("Пол - " + Const.W);

    }
}
