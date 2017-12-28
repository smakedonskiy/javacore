package com.kit.center.app.classwork.lesson_11to20.lesson13;

public class Student extends Person {
  public Student(String name) {
    super(name);
  }
  public void show(){
  }
  @Override
  public String getResponse(String question) {
    return "Eh, What is a question";
  }
  @Override
  public String toString() {
    return "Student " + "name=" + name;
  }

  @Override
  public void clean() {
    System.out.println("Student can water.");
  }
}
