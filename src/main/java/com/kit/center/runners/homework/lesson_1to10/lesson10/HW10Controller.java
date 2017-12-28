package com.kit.center.runners.homework.lesson_1to10.lesson10;

import com.kit.center.app.homework.lesson_1to10.lesson10.FileTaskA;
import com.kit.center.app.homework.lesson_1to10.lesson10.FileTaskB;
import com.kit.center.app.homework.lesson_1to10.lesson10.FileTaskC;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

public class HW10Controller extends AHomework {

  FileTaskA taskA = new FileTaskA();
  FileTaskB taskB = new FileTaskB();
  FileTaskC taskC = new FileTaskC();

  {
    super.name += "10. ";
    super.description += "\"File, Exceptions\".";
  }

  @Override
  public void run() {
    printHelp();
    System.out.print("Input your number: ");
    chooseProgram(sc.nextInt());
  }

  private void printHelp() {
    String helpMessage = "\n*** Help for " + getName() + "***\n" +
            "0 - exit\n" +
            "1 - " + taskA.getName() + "\n" +
            "2 - " + taskB.getName() + "\n" +
            "3 - " + taskC.getName();
    System.out.println(helpMessage);
  }

  private void chooseProgram(int userInput) {
    switch (userInput) {
      case 0:
        TotalController totalController = new TotalController();
        totalController.start();
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
