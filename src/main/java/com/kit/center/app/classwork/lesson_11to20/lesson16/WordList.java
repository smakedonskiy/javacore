package com.kit.center.app.classwork.lesson_11to20.lesson16;

import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    ArrayList<String> wordList = new ArrayList<>();

    while (exit == false) {
      System.out.print("Input a word: ");
      String str = sc.next();
      if (str.equals("exit")) {
        exit = true;
      }else {
        wordList.add(str);
      }
    }

    System.out.println("\nArrayList has:");
    for (String word : wordList){
      System.out.println(word);
    }

  }
}
