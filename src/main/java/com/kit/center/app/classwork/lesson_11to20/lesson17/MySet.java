package com.kit.center.app.classwork.lesson_11to20.lesson17;

import java.util.TreeSet;

public class MySet {
  public static void main(String[] args) {
    TreeSet<String> set = new TreeSet<>();
    set.add("vaz");
    set.add("gaz");
    set.add("volvo");
    set.add("vaz");
    set.add("gaz");
    set.add("volvo");
    set.add("audi");
    set.add("audi");
    set.add("vaz");
    set.add("vaz");
    set.add("gaz");
    set.add("volvo");
    set.add("audi");
    set.add("gaz");
    set.add("volvo");
    set.add("audi");

    for (String s : set){
      System.out.println(s);
    }
  }
}
