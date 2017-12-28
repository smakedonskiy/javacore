package com.kit.center.app.homework.lesson_11to20.lesson14.taskA;

public abstract class Mashine implements Run {
  public static final int MAX_SPEED = 60;
  public static final int MIN_SPEED = 5;
  public static final int MIN_NUMBER_OF_PASSENGERS = 0;
  public static final int MAX_NUMBER_OF_PASSENGERS = 1;
  protected String name;
  protected int actualSpeed;

  public Mashine(String name, int actualSpeed) {
    this.name = name;
    this.actualSpeed = actualSpeed;
  }

  @Override
  public void printName() {
    System.out.println("Mashine name: \"" + name + "\"");
  }

}
