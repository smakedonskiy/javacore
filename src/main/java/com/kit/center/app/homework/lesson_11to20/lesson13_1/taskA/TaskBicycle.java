package com.kit.center.app.homework.lesson_11to20.lesson13_1.taskA;

import com.kit.center.app.homework.service.ATask;

public class TaskBicycle extends ATask {

  {
    super.name += "\"Bicycle\"";
    super.description += "This program outputs a ring and a ride";
  }

  @Override
  public void run() {
    super.run();
    BicycleWithRingInterface bicycleWithRing = new BicycleWithRing();
    bicycleWithRing.ring();
    Bicycle customBicycle = new CustomBicycle();
    customBicycle.setGear(5);
    customBicycle.ride();
    quit();
  }
}
