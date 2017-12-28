package com.kit.center.app.classwork.lesson_11to20.lesson13;

public class Teacher extends Person {
  public Teacher(String name) {
    super(name);
  }
  @Override
  public String getResponse(String question) {
    return "Do not forget to make a homework";
  }



  @Override
  public void clean() {
    System.out.println("Teacher do not clean.");
  }
}
