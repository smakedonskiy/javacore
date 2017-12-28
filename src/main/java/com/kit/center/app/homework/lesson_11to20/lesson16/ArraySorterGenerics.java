package com.kit.center.app.homework.lesson_11to20.lesson16;

import java.util.Arrays;

public class ArraySorterGenerics<T extends Number> {

  private T[] numberArray;


  public ArraySorterGenerics(T[] numberArray) {
    this.numberArray = numberArray;
  }

  public void sort(){
    Arrays.sort(numberArray);
  }

  public T[] getNumberArray() {
    return numberArray;
  }


  public static <T extends Number> T[] sort(T[] numberArray){
    Arrays.sort(numberArray);
    return numberArray;
  }
}
