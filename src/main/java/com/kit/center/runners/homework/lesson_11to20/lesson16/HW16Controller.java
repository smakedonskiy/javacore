package com.kit.center.runners.homework.lesson_11to20.lesson16;

import com.kit.center.app.homework.lesson_11to20.lesson16.TaskGenerics;
import com.kit.center.app.homework.service.AHomework;


public class HW16Controller extends AHomework {
  private static HW16Controller instance = null;

  private HW16Controller() {
  }

  public static HW16Controller getInstance(){
    if (instance == null){
      instance = new HW16Controller();
    }
    return instance;
  }

  {
    super.name += "16. ";
    super.description += "\"OOP. Generics\".";
  }

  @Override
  public void run() {
    super.run();
    TaskGenerics generics = new TaskGenerics();
    generics.run();
  }
}
