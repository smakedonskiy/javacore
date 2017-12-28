package com.kit.center.app.classwork.lesson_11to20.lesson12;

public class MyClass {
  public static void main(String[] args) {
//        Bicycle bicycle1 = new Bicycle();
//        Bicycle bicycle2 = new Bicycle(1,"green","uk");
//        Bicycle bicycle3 = new Bicycle(25,"black", "usa", 52);
//        System.out.println(bicycle1);
//        System.out.println(bicycle2);
//        System.out.println(bicycle3);

    Student student = new Student("Den", "NAU");
    student.printAge();
    student.printMyBook();
    System.out.println("My name: " + student.name);

    Person teacher = new Teacher("Nina");
    teacher.printDay();
  }
}
