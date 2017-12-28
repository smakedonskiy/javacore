package com.kit.center.app.classwork.lesson_11to20.lesson14.task1;

public class ACMEBicycle implements Bicycle {

  int cadence = 0;
  int speed = 0;
  int gear = 1;

  @Override
  public void changeCadence(int newValue) {
    this.cadence = newValue;
  }

  @Override
  public void changeGear(int newValue) {
    this.gear = newValue;
  }

  @Override
  public void printID(int id) {
    System.out.println("id = " + id);
  }

  public void printStates(){
    System.out.println(cadence+" "+speed+" "+gear);
  }
}
