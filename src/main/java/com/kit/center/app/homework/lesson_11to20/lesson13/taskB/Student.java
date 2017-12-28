package com.kit.center.app.homework.lesson_11to20.lesson13.taskB;

public class Student extends Person {

  public Student(String university, int age) {
    super(university, age);
  }

  @Override
  public void showDegree() {
    System.out.println("Student's degree");
  }
}
