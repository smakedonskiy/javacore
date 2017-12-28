package com.kit.center.runners.classwork.lesson_11to20.lesson13;

import com.kit.center.app.classwork.lesson_11to20.lesson13.Car;
import com.kit.center.app.classwork.lesson_11to20.lesson13.Engine;

public class CarRunner {
  public static void main(String[] args) {
    Engine v12 = new Engine("V12");
    Car bmw = new Car(v12);

    System.out.println(bmw.getEngine().getName());
  }
}
