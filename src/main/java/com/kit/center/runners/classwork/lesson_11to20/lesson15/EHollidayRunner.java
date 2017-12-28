package com.kit.center.runners.classwork.lesson_11to20.lesson15;

import com.kit.center.app.classwork.lesson_11to20.lesson15.EHolliday;

public class EHollidayRunner {
  public static void main(String[] args) {
    for (EHolliday holliday : EHolliday.values()){
      System.out.println("\"" + holliday.getDescription() + "\" holiday is on " +
              holliday.getMonthName() + ", " + holliday.getNumberDay() + ".");
    }
  }
}
