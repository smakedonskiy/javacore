package com.kit.center.app.classwork.lesson_11to20.lesson15;

public enum EHolliday {

  NEW_YEAR(1,"January","New Year"),
  WOMAN_DAY(8,"March","8 March"),
  KNOW_DAY(1,"September","Day of know");


  private int numberDay;
  String monthName;
  String description;


  EHolliday(int day, String month, String description) {
    this.numberDay = day;
    this.monthName = month;
    this.description = description;
  }

  public int getNumberDay() {
    return numberDay;
  }

  public String getMonthName() {
    return monthName;
  }

  public String getDescription() {
    return description;
  }
}
