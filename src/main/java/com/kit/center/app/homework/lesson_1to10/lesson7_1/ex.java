package com.kit.center.app.homework.lesson_1to10.lesson7_1;

public class ex {
static int array[] = new int [15];

  public static void main(String[] args) {
   createArray();
   printArray();
  }

  static public void createArray(){
    for (int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random()*10);
    }
  }

  static public void printArray(){
    for ( int i : array)
      System.out.println(i + " ");
    //System.out.println();
  }
}

