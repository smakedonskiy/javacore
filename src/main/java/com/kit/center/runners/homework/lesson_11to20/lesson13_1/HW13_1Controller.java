package com.kit.center.runners.homework.lesson_11to20.lesson13_1;

import com.kit.center.app.homework.lesson_11to20.lesson13_1.taskA.TaskBicycle;
import com.kit.center.app.homework.lesson_11to20.lesson13_1.taskB.TaskBasket;
import com.kit.center.app.homework.lesson_11to20.lesson13_1.taskC.TaskComputer;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

public class HW13_1Controller extends AHomework {

  TaskBicycle taskA = new TaskBicycle();
  TaskBasket taskB = new TaskBasket();
  TaskComputer taskC = new TaskComputer();

  {
    super.name += "13_1. ";
    super.description += "\"OOP. Polymorphism\".";
  }

  @Override
  public void run() {
    printHelp();
    System.out.print("Input your number: ");
    chooseTask(sc.nextInt());
  }

  private void printHelp() {
    String helpMessage = "\n*** Help for " + getName() + "***\n" +
            "0 - exit\n" +
            "1 - " + taskA.getName() + "\n" +
            "2 - " + taskB.getName() + "\n" +
            "3 - " + taskC.getName();
    System.out.println(helpMessage);
  }

  private void chooseTask(int userNumber) {
    switch (userNumber) {
      case 0:
        new TotalController().start();
        break;
      case 1:
        taskA.run();
        break;
      case 2:
        taskB.run();
        break;
      case 3:
        taskC.run();
        break;
      default:
        run();
    }
  }
}
