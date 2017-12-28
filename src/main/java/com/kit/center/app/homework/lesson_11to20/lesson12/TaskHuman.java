package com.kit.center.app.homework.lesson_11to20.lesson12;

import com.kit.center.app.homework.service.ATask;

public class TaskHuman extends ATask{

  {
    super.name += "\"Class a Human\"";
    super.description += "This program check an age";
  }

  @Override
  public void run() {
    super.run();

    System.out.print("Input age: ");
    int age = sc.nextInt();
    System.out.print("Input name: ");
    String name = sc.next();
    new Human(age, name);

    quit();
  }


}
