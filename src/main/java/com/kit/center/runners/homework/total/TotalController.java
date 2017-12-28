package com.kit.center.runners.homework.total;

import com.kit.center.app.homework.lesson_11to20.lesson12.TaskHuman;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskA.TaskCompanyName;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskB.TaskLecturer;
import com.kit.center.app.homework.lesson_11to20.lesson13.taskC.TaskShowDegree;
import com.kit.center.app.homework.lesson_11to20.lesson13_1.taskA.TaskBicycle;
import com.kit.center.app.homework.lesson_11to20.lesson13_1.taskB.TaskBasket;
import com.kit.center.app.homework.lesson_11to20.lesson13_1.taskC.TaskComputer;
import com.kit.center.app.homework.lesson_11to20.lesson14.taskA.TaskTractor;
import com.kit.center.app.homework.lesson_11to20.lesson14.taskB.TaskFootballClub;
import com.kit.center.app.homework.lesson_11to20.lesson14.taskC.TaskHouse;
import com.kit.center.app.homework.lesson_11to20.lesson15.TaskPersonGame;
import com.kit.center.app.homework.lesson_11to20.lesson16.TaskGenerics;
import com.kit.center.app.homework.lesson_11to20.lesson17.TaskPhoneBook;
import com.kit.center.app.homework.lesson_1to10.lesson10.FileTaskA;
import com.kit.center.app.homework.lesson_1to10.lesson10.FileTaskB;
import com.kit.center.app.homework.lesson_1to10.lesson10.FileTaskC;
import com.kit.center.app.homework.lesson_1to10.lesson4.PrimitiveConverter;
import com.kit.center.app.homework.lesson_1to10.lesson5.DifferentExamples;
import com.kit.center.app.homework.lesson_1to10.lesson6.BiggerNumber;
import com.kit.center.app.homework.lesson_1to10.lesson6.CircleArea;
import com.kit.center.app.homework.lesson_1to10.lesson6.Triangle;
import com.kit.center.runners.homework.lesson_11to20.lesson12.HW12Controller;
import com.kit.center.runners.homework.lesson_11to20.lesson13.HW13Controller;
import com.kit.center.runners.homework.lesson_11to20.lesson13_1.HW13_1Controller;
import com.kit.center.runners.homework.lesson_11to20.lesson14.HW14Controller;
import com.kit.center.runners.homework.lesson_11to20.lesson15.HW15Controller;
import com.kit.center.runners.homework.lesson_11to20.lesson16.HW16Controller;
import com.kit.center.runners.homework.lesson_11to20.lesson17.HW17Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson10.HW10Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson4.HW4Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson5.HW5Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson6.HW6Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson7.HW7Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson7_1.HW7_1Controller;
import com.kit.center.runners.homework.lesson_1to10.lesson9.HW9Controller;

import java.util.Scanner;


public class TotalController {

  Scanner sc = new Scanner(System.in);

  HW4Controller hw4 = new HW4Controller();
  PrimitiveConverter converter = new PrimitiveConverter();
  HW5Controller hw5 = new HW5Controller();
  DifferentExamples differentExamples = new DifferentExamples();
  HW6Controller hw6 = new HW6Controller();
  BiggerNumber bigNumber = new BiggerNumber();
  CircleArea circleArea = new CircleArea();
  Triangle triangle = new Triangle();
  HW7Controller hw7 = new HW7Controller();
  HW7_1Controller hw71 = new HW7_1Controller();
  HW9Controller hw9 = new HW9Controller();
  HW10Controller hw10 = new HW10Controller();
  FileTaskA fileTaskA = new FileTaskA();
  FileTaskB fileTaskB = new FileTaskB();
  FileTaskC fileTaskC = new FileTaskC();
  HW12Controller hw12 = new HW12Controller();
  TaskHuman human = new TaskHuman();
  HW13Controller hw13 = new HW13Controller();
  TaskCompanyName companyName = new TaskCompanyName();
  TaskLecturer lecturer = new TaskLecturer();
  TaskShowDegree degree = new TaskShowDegree();
  HW13_1Controller hw13_1 = new HW13_1Controller();
  TaskBicycle bicycle = new TaskBicycle();
  TaskBasket basket = new TaskBasket();
  TaskComputer computer = new TaskComputer();
  HW14Controller hw14 = new HW14Controller();
  TaskTractor tractor = new TaskTractor();
  TaskFootballClub club = new TaskFootballClub();
  TaskHouse house = new TaskHouse();
  HW15Controller hw15 = new HW15Controller();
  TaskPersonGame personGame = new TaskPersonGame();
  //HW16Controller hw16 = new HW16Controller(); => using Singlton pattern
  TaskGenerics generics = new TaskGenerics();
  HW17Controller hw17 = new HW17Controller();
  TaskPhoneBook phoneBook = new TaskPhoneBook();

  private String quitMessage = "\nBye!";


  public void start() {
    printHelp();
    System.out.print("Input your number: ");
    chooseProgram(sc.nextInt());
  }

  private void chooseProgram(int userInput) {
    switch (userInput) {
      case 0:
        System.out.println(quitMessage);
        break;
      case 4:
        hw4.run();
        break;
      case 41:
        converter.run();
      case 5:
        hw5.run();
        break;
      case 51:
        differentExamples.run();
      case 6:
        hw6.run();
        break;
      case 61:
        triangle.run();
        break;
      case 62:
        circleArea.run();
        break;
      case 63:
        bigNumber.run();
        break;
      case 7:
        System.out.println("\nHomework 7 does not run.\n" +
                "Choose another Homework, please.");
        start();
        break;
      case 8:
        hw71.run();
        break;
      case 9:
        hw9.run();
        break;
      case 10:
        hw10.run();
        break;
      case 101:
        fileTaskA.run();
        break;
      case 102:
        fileTaskB.run();
        break;
      case 103:
        fileTaskC.run();
        break;
      case 11:
        hw13_1.run();
        break;
      case 111:
        bicycle.run();
        break;
      case 112:
        basket.run();
        break;
      case 113:
        computer.run();
        break;
      case 12:
        hw12.run();
        break;
      case 121:
        human.run();
        break;
      case 13:
        hw13.run();
        break;
      case 131:
        companyName.run();
        break;
      case 132:
        lecturer.run();
        break;
      case 133:
        degree.run();
        break;
      case 14:
        hw14.run();
        break;
      case 141:
        tractor.run();
        break;
      case 142:
        club.run();
        break;
      case 143:
        house.run();
        break;
      case 15:
        hw15.run();
        break;
      case 151:
        personGame.run();
        break;
      case 16:
        HW16Controller.getInstance().run();
        break;
      case 161:
        generics.run();
        break;
      case 17:
        hw17.run();
        break;
      case 171:
        phoneBook.run();
        break;
      default:
        start();
    }
  }

  private void printHelp() {
    String helpMessage = "\n*** TOTAL HELP (Java Core) ***\n" +
            "  0 - exit\n" +
            "  4 - " + hw4.getName() + hw4.getDescription() + "\n" +
            " 41 - " + converter.getName() + "\n" +
            "  5 - " + hw5.getName() + hw5.getDescription() + "\n" +
            " 51 - " + differentExamples.getName() + "\n" +
            "  6 - " + hw6.getName() + hw6.getDescription() + "\n" +
            " 61 - " + triangle.getName() + "\n" +
            " 62 - " + circleArea.getName() + "\n" +
            " 63 - " + bigNumber.getName() + "\n" +
            "  7 - " + hw7.getName() + hw7.getDescription() + "\n" +
            "  8 - " + hw71.getName() + hw71.getDescription() + "\n" +
            "  9 - " + hw9.getName() + hw9.getDescription() + "\n" +
            " 10 - " + hw10.getName() + hw10.getDescription() + "\n" +
            "101 - " + fileTaskA.getName() + "\n" +
            "102 - " + fileTaskB.getName() + "\n" +
            "103 - " + fileTaskC.getName() + "\n" +
            " 11 - " + hw13_1.getName() + hw13_1.getDescription() + "\n" +
            "111 - " + bicycle.getName() + "\n" +
            "112 - " + basket.getName() + "\n" +
            "113 - " + computer.getName() + "\n" +
            " 12 - " + hw12.getName() + hw12.getDescription() + "\n" +
            "121 - " + human.getName() + "\n" +
            " 13 - " + hw13.getName() + hw13.getDescription() + "\n" +
            "131 - " + companyName.getName() + "\n" +
            "132 - " + lecturer.getName() + "\n" +
            "133 - " + degree.getName() + "\n" +
            " 14 - " + hw14.getName() + hw14.getDescription() + "\n" +
            "141 - " + tractor.getName() + "\n" +
            "142 - " + club.getName() + "\n" +
            "143 - " + house.getName() + "\n" +
            " 15 - " + hw15.getName() + hw15.getDescription() + "\n" +
            "151 - " + personGame.getName() + "\n" +
            " 16 - " + HW16Controller.getInstance().getName() + HW16Controller.getInstance().getDescription() + "\n" +
            "161 - " + generics.getName() + "\n" +
            " 17 - " + hw17.getName() + hw17.getDescription() + "\n" +
            "171 - " + phoneBook.getName() + "\n";
    System.out.println(helpMessage);
  }
}
