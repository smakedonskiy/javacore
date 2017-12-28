package com.kit.center.app.homework.lesson_11to20.lesson17;

public class Line {
  private String name;
  private int number;

  public Line(String name, int number) {
    setName(name);
    setNumber(number);
  }

  @Override
  public String toString() {
    return name + " : " + number;
  }

  public String getName() {
    return name.toUpperCase();
  }

  public void setName(String name) {
    String firstLetter = name.substring(0,1).toUpperCase();
    String nextLetters = name.substring(1,name.length()).toLowerCase();
    this.name = firstLetter + nextLetters;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }


}
