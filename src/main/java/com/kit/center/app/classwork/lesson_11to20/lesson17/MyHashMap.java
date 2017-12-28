package com.kit.center.app.classwork.lesson_11to20.lesson17;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class MyHashMap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TreeSet<String> set = new TreeSet<>();
    HashMap<String, TreeSet> map = new HashMap<>();

    while (true) {
      System.out.print("Input category: ");
      String category = sc.nextLine();
      while (true) {
        System.out.print("Input element: ");
        String element = sc.nextLine();
        if (element.equals("exit")) {
          break;
        }
        set.add(element);
      }
      if (category.equals("exit")) {
        break;
      }
      map.put(category, set);
    }

    for (String s : set) {
      System.out.println(s);
    }
  }
}
