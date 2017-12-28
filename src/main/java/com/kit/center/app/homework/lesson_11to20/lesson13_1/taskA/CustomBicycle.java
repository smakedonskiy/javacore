package com.kit.center.app.homework.lesson_11to20.lesson13_1.taskA;

public class CustomBicycle extends Bicycle {

  int speed;
  int gear;

  @Override
  void setSpeed(int speed) {
    this.speed = speed;
    System.out.println("speed = " + speed);
  }

  @Override
  void setGear(int gear) {
    this.gear = gear;
    System.out.println("gear = " + gear);
  }

  @Override
  public void ride() {
    System.out.println("Wshhhh!");
  }
}
