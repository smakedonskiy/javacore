package com.kit.center.runners.homework.lesson_11to20.lesson14;

import com.kit.center.app.homework.lesson_11to20.lesson14.taskA.TaskTractor;
import com.kit.center.app.homework.lesson_11to20.lesson14.taskB.TaskFootballClub;
import com.kit.center.app.homework.lesson_11to20.lesson14.taskC.TaskHouse;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

public class HW14Controller extends AHomework {

  TaskTractor tractor = new TaskTractor();
  TaskFootballClub club = new TaskFootballClub();
  TaskHouse house = new TaskHouse();

  {
    super.name += "14. ";
    super.description += "\"OOP. Interfaces\".";
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
            "1 - " + tractor.getName() + "\n" +
            "2 - " + club.getName() + "\n" +
            "3 - " + house.getName();
    System.out.println(helpMessage);
  }

  private void chooseTask(int userNumber) {
    switch (userNumber) {
      case 0:
        new TotalController().start();
        break;
      case 1:
        tractor.run();
        break;
      case 2:
        club.run();
        break;
      case 3:
        house.run();
        break;
      default:
        run();
    }
  }
}
