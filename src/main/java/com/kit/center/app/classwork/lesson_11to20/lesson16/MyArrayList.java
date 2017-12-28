package com.kit.center.app.classwork.lesson_11to20.lesson16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
  public static void main(String[] args) {
    List<String> myList = new LinkedList<>();
    String string1 = "abc";
    String string2 = "bcd";
    myList.add(string1);
    myList.add(string2);
    myList.add("abc");
    myList.add("bcd");
    myList.add("abc");
    System.out.println(myList.size());

    System.out.println();
  }
}
