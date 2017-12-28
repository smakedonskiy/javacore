package com.kit.center.runners.homework.lesson_11to20.lesson12;

import com.kit.center.app.homework.lesson_11to20.lesson12.Human;
import com.kit.center.app.homework.lesson_11to20.lesson12.TaskHuman;
import com.kit.center.app.homework.service.AHomework;

public class HW12Controller extends AHomework {

  {
    super.name += "12. ";
    super.description += "\"OOP. Encapsulation\".";
  }

  @Override
  public void run() {
    System.out.println();
    TaskHuman taskHuman = new TaskHuman();
    taskHuman.run();

  }
}
