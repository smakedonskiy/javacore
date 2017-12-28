package com.kit.center.app.classwork.lesson_11to20.lesson12;

public class Bicycle {
  private int wheelSize;
  private String color;
  private String factory;
  private int id;

  public Bicycle() {
    this.wheelSize = 26;
    this.color = "red";
  }

  public Bicycle(int wheelSize) {
    this();
    this.wheelSize = wheelSize;
  }

  public Bicycle(int wheelSize, String color) {
    this(wheelSize);
    this.color = color;
  }

  public Bicycle(int wheelSize, String color, String factory) {
    this(wheelSize, color);
    this.factory = factory;
  }

  public Bicycle(int wheelSize, String color, String factory, int id) {
    this(wheelSize, color, factory);
    this.id = id;
  }

  public String ride() {
    return "Whoom!";
  }

  @Override
  public String toString() {
    return "Bicycle{" +
            "wheelSize=" + wheelSize +
            ", color='" + color + '\'' +
            ", factory='" + factory + '\'' +
            ", id=" + id +
            '}';
  }
}
