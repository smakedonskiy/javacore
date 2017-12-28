package com.kit.center.app.classwork.lesson_11to20.lesson12;

public class Person {
  protected String name;
  protected int age = 20;

  public Person(String name) {
    this.name = name;
  }

  public void printAge() {
    System.out.println("age: " + age);
  }

  public final void printDay() {
    System.out.println("Sunday");
  }

}
