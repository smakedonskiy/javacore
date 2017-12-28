package com.kit.center.app.homework.lesson_11to20.lesson14.taskC;

public class House {
  private Flat flat;

  public House(Flat flat) {
    this.flat = flat;
    System.out.println("Created a House and a Flat.");
    System.out.println("The House has the Flat => This is a \"composition\".");
  }

  public Flat getFlat() {
    return flat;
  }
}
