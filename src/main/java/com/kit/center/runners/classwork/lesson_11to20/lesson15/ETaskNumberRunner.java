package com.kit.center.runners.classwork.lesson_11to20.lesson15;

import com.kit.center.app.classwork.lesson_11to20.lesson15.ETaskNumber;

import java.util.Scanner;

public class ETaskNumberRunner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Input a word: ");
    String userWord = scanner.next();

    try {
    ETaskNumber taskNumber = ETaskNumber.valueOf(userWord.toUpperCase());

      switch (taskNumber) {
        case ONE:
          System.out.println("task 1");
          break;
        case TWO:
          System.out.println("task 2");
          break;
        case THREE:
          System.out.println("task 3");
          break;
        case FOUR:
          System.out.println("task 4");
          break;
        case FIVE:
          System.out.println("task 5");
          break;
        default:
          System.out.println("Wrong");
      }
    }catch (IllegalArgumentException e){
      System.out.println("Invalid word!");
    }
  }

}
