package com.kit.center.app.homework.lesson_11to20.lesson12;

public class Human {

    private int age;
    private String name;

    public Human(int age, String name){
        setAge(age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age>=1 && age<=120){
            this.age = age;
            System.out.println("New age setted");
        }else {
            System.out.println("Age invalid");
        }
    }

}
