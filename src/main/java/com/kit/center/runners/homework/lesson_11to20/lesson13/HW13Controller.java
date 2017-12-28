package com.kit.center.runners.homework.lesson_11to20.lesson13;

import com.kit.center.app.homework.lesson_11to20.lesson13.taskA.TaskCompanyName;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskB.TaskLecturer;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskC.TaskShowDegree;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

public class HW13Controller extends AHomework {

  {
    super.name += "13. ";
    super.description += "\"OOP. Inheritance\".";
  }

  TaskCompanyName companyName = new TaskCompanyName();
  TaskLecturer lecturer = new TaskLecturer();
  TaskShowDegree degree = new TaskShowDegree();


  @Override
  public void run() {
    printHelp();
    System.out.print("Input your number: ");
    chooseProgram(sc.nextInt());

    quit();
  }

  private void printHelp() {
    String helpMessage = "\n*** Help for " + getName() + "***\n" +
            "0 - exit\n" +
            "1 - " + companyName.getName() + "\n" +
            "2 - " + lecturer.getName() + "\n" +
            "3 - " + degree.getName();
    System.out.println(helpMessage);
  }

  private void chooseProgram(int userInput) {
    switch (userInput) {
      case 0:
        TotalController totalController = new TotalController();
        totalController.start();
        break;
      case 1:
        companyName.run();
        break;
      case 2:
        lecturer.run();
        break;
      case 3:
        degree.run();
        break;
      default:
        run();
    }
  }

}
