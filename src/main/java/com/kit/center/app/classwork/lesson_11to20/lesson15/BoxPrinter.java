package com.kit.center.app.classwork.lesson_11to20.lesson15;

public class BoxPrinter<T> {
  private T value;

  public BoxPrinter(T value){
    this.value = value;
  }

  @Override
  public String toString() {
    return "BoxPrinter{" +
            "value=" + value +
            '}';
  }

  public T getValue() {
    return value;
  }
}
