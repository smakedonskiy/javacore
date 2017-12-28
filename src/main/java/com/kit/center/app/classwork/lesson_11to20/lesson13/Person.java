package com.kit.center.app.classwork.lesson_11to20.lesson13;

public class Person {
  protected String name;
  public Person(String name) {
    this.name = name;
  }
  public String getResponse(String question) {
    return "My answer is " + question;
  }

  public void clean(){
    System.out.println("You must clean.");
  }



}
