package com.kit.center.app.homework.lesson_11to20.lesson13.taskB;

import com.kit.center.app.homework.service.ATask;


public class TaskLecturer extends ATask {

  {
    super.name += "\"Lecturer's info\"";
    super.description += "This program shows information about a lecturer";
  }

  @Override
  public void run() {
    super.run();

    Lecturer lecturer = new Lecturer("Shevchenko",
            37,"Medical",10,"doctor");
    lecturer.printInfoAboutLecturer();

    quit();
  }
}
