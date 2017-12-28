package com.kit.center.runners.homework.lesson_1to10.lesson7_1;

import com.kit.center.app.homework.lesson_1to10.lesson7_1.*;
import com.kit.center.app.homework.service.AHomework;
import com.kit.center.runners.homework.total.TotalController;

import java.util.Scanner;

public class HW7_1Controller extends AHomework {
  private boolean closeProgram = false;

  {
    super.name += "7_1. ";
    super.description += "\"Switch, Loop, Array\".";
  }

  @Override
  public void run() {
    while (closeProgram == false) {
      printHelp();
      System.out.print("Input your number: ");
      chooseProgram();
    }
    TotalController controller = new TotalController();
    controller.start();
  }

  private void showTaskA() {
    System.out.println(
            "* The task 'a' description:\n" +
                    "* This program creates the array of pair numbers\n" +
                    "* from 2 to 20 and shows it.\n");
    ArrayA arrayA = new ArrayA();
    arrayA.createArray();
    arrayA.printLineArray();
    arrayA.printColumnArray();
  }

  private void showTaskB() {
    System.out.println(
            "* The task 'b' description:\n" +
                    "* This program creates the array of odd numbers\n" +
                    "* from 1 to 99 and shows it.\n");
    ArrayB arrayB = new ArrayB();
    arrayB.createArray();
    arrayB.printLineArray();
    arrayB.printLineReversArray();
  }

  private void showTaskC() {
    System.out.println(
            "* The task 'c' description:\n" +
                    "* This program creates the array of 15 random values\n" +
                    "* from 0 to 9 and count all pair numbers.\n");
    ArrayC arrayC = new ArrayC();
    arrayC.createArray();
    arrayC.printArray();
    arrayC.printCountPairElementsOfArray();
    arrayC.printCountZeroElementsOfArrey();
  }

  private void showTaskD() {
    System.out.println(
            "* The task 'd' description:\n" +
                    "* This program creates the array of 15 random values\n" +
                    "* from 0 to 999 and shows min and max numbers.\n");
    ArrayD arrayD = new ArrayD();
    arrayD.createArray();
    arrayD.printArray();
    arrayD.printMinElementOfArray();
    arrayD.printMaxElementOfArray();
  }

  private void showTaskE() {
    System.out.println(
            "* The task 'e' description:\n" +
                    "* This program creates the two-dimensional array\n" +
                    "* of 8 lines and 5 columns with random values\n" +
                    "* from 10 to 99 and shows it.\n");
    ArrayE arrayE = new ArrayE();
    arrayE.createArray();
    arrayE.printArray();
  }

  private void showTaskF() {
    System.out.println(
            "* The task 'f' description:\n" +
                    "* This program creates the two-dimensional array\n" +
                    "* of 8 lines and 5 columns with random values\n" +
                    "* from 1 to 999 and shows it.\n");
    ArrayF arrayF = new ArrayF();
    arrayF.createArray();
    arrayF.printArray();
  }

  private void showTaskG() {
    System.out.println(
            "* The task 'g' description:\n" +
                    "* This program adds numbers what you input.\n" +
                    "* Please, input 'exit' for closed this program.\n");
    ArrayG arrayG = new ArrayG();
    arrayG.createArray();
    arrayG.printSumAllElementsOfArray();
  }

  private void printHelp() {
    System.out.println("\n*** Help for Homework 7_1 ***\n" +
            "0 - exit\n" +
            "1 - show the task 'a'\n" +
            "2 - show the task 'b'\n" +
            "3 - show the task 'c'\n" +
            "4 - show the task 'd'\n" +
            "5 - show the task 'e'\n" +
            "6 - show the task 'f'\n" +
            "7 - show the task 'g'\n");
  }

  private int getUserNumberInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  private void chooseProgram() {
    switch (getUserNumberInput()) {
      case 0:
        closeProgram = true;
        break;
      case 1:
        showTaskA();
        break;
      case 2:
        showTaskB();
        break;
      case 3:
        showTaskC();
        break;
      case 4:
        showTaskD();
        break;
      case 5:
        showTaskE();
        break;
      case 6:
        showTaskF();
        break;
      case 7:
        showTaskG();
        break;
      default:
        printHelp();
    }
    System.out.println();
  }
}
