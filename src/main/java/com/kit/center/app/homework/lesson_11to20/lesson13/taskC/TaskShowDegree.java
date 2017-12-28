package com.kit.center.app.homework.lesson_11to20.lesson13.taskC;

import com.kit.center.app.homework.lesson_11to20.lesson13.taskB.Lecturer;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskB.Person;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskB.Student;
import com.kit.center.app.homework.service.ATask;


public class TaskShowDegree extends ATask {

  {
    super.name += "\"Degree\"";
    super.description += "This program shows the work of override method";
  }

  Person student = new Student("MIMO",20);
  Person lecturer = new Lecturer("MIMO",70,"Art",50,"doctor");

  @Override
  public void run() {
    super.run();

    student.showDegree();
    lecturer.showDegree();

    quit();
  }
}
