package com.company.DZHuman;

public class Main {
    public static void main(String[] args) {


        Person person2 = new Person("Zulfiya", 19, "Женский");

        Man man2 = new Man("Grigoriy", 33);
        man2.getName();
        man2.getAge();
        man2.getGender();
        if (person2.gender.equals("Женский")){
            man2.setWife(person2);
        } else {
            System.out.println("Педики");
        }
    }
}
