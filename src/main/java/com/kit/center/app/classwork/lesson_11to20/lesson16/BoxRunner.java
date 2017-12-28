package com.kit.center.app.classwork.lesson_11to20.lesson16;

public class BoxRunner {
  public static void main(String[] args) {
    Box<Integer> intBox = new Box<>();
    intBox.set(new Integer(10));
    intBox.inspect(21.0d);

    intBox.set((int) 'c');
    intBox.inspect(5);
  }
}
