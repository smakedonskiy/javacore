package com.kit.center.runners.classwork.lesson_11to20.lesson15;

import com.kit.center.app.classwork.lesson_11to20.lesson15.BoxPrinter;

public class BoxPrinterRunner {
  public static void main(String[] args) {
    BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
    System.out.println(value1);
    Integer intValue1 = value1.getValue();

    BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
    System.out.println(value2);

    String intValue2 = value2.getValue();
  }
}
