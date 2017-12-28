package com.kit.center.app.classwork.lesson_11to20.lesson14.task2;

public class Mentor extends Teacher {

  public Mentor(String name) {
    super(name);
  }



  @Override
  public void lessonFinished(){
    System.out.println("go to home");
  }

}
