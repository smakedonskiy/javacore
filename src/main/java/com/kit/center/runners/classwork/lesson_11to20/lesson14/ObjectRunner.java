package com.kit.center.runners.classwork.lesson_11to20.lesson14;

import com.kit.center.app.classwork.lesson_11to20.lesson14.task1.ACMEBicycle;
import com.kit.center.app.classwork.lesson_11to20.lesson14.task1.Bicycle;

public class ObjectRunner {
  public static void main(String[] args) {
    Object car = new ACMEBicycle();
    Bicycle car1 = new ACMEBicycle();
    Object objCar1 = car1;
    car1 = (Bicycle) objCar1;

  }
}
