package com.kit.center.app.homework.lesson_11to20.lesson15;

public enum EPerson {

  MADONNA("Madonna Louise Veronica Ciccone", 59, true),
  JACKSON("Michael Joseph Jackson", 50, false),
  LOPEZ("Jennifer Lynn Lopez", 48, true),
  MERCURY("Freddi Mercury", 45, false),
  ELVIS("Elvis Aaron Presley", 42, false),
  MCCARTNEY("James Paul McCartney", 75, true),
  GAGA("Stefani Joanne Angelina Germanotta (Lady Gaga)", 31, true),
  PAVAROTTI("Luciano Pavarotti", 71, false),
  PINK("Alecia Beth Moore (Pink)", 38, true);

  private String name;
  private int age;
  private boolean isAlive;

  EPerson(String name, int age, boolean isAlive) {
    this.name = name;
    this.age = age;
    this.isAlive = isAlive;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isAlive() {
    return isAlive;
  }
}
