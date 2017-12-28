package com.kit.center.app.homework.lesson_11to20.lesson14.taskA;

public abstract class Tractor extends Mashine{
  protected int weight;
  protected int wheel;
  protected int passengers;

  public Tractor(String name, int actualSpeed, int weight, int wheel, int passengers) {
    super(name, actualSpeed);
    this.weight = weight;
    this.wheel = wheel;
    this.passengers = passengers;
  }

  public void printTractorInfo(){
    System.out.print("*** Tractor info: ***\n");
    printName();
    String infoMessage = "actual speed: " + getSpeed() + "\n" +
            "actual passengers: " + getNumberOfPassengers() + "\n" +
            "weight: " + getWeight() + "\n" +
            "number of wheels: " + getNumberOfWheels() + "\n" +
            "min speed: " + MIN_SPEED + "\n" +
            "max speed: " + MAX_SPEED + "\n" +
            "min number of passengers: " + MIN_NUMBER_OF_PASSENGERS + "\n" +
            "max number of passengers: " + MAX_NUMBER_OF_PASSENGERS + "\n";
    System.out.println(infoMessage);
  }

  @Override
  public int getSpeed() {
    return actualSpeed;
  }

  @Override
  public int getWeight() {
    return weight;
  }

  @Override
  public int getNumberOfPassengers() {
    return 0;
  }

  @Override
  public int getNumberOfWheels() {
    return wheel;
  }

}
