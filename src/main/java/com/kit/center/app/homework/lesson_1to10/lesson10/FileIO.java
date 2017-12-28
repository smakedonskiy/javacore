package com.kit.center.app.homework.lesson_1to10.lesson10;

import com.kit.center.app.homework.service.ATask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public abstract class FileIO extends ATask {

  protected String delimiter = ",";


  protected void writeToFile(File file, int[] array) {
    try {
      FileWriter fileWriter = new FileWriter(file);
      for (int i : array) {
        fileWriter.write(i + delimiter);
      }
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  protected void writeToFile(File file, String[] array) {
    try {
      FileWriter fileWriter = new FileWriter(file);
      for (String i : array) {
        fileWriter.write(i + "\r\n");
      }
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  protected void writeToFile(File file, String text) {
    try {
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write(text);
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  protected void readFromFile(File file, int[] array) {
    try {
      Scanner scanner = new Scanner(file);
      scanner.useDelimiter(delimiter);
      int i = 0;
      while (scanner.hasNextInt()) {
        array[i++] = scanner.nextInt();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  protected void readFromFile(File file, String[] array) {
    try {
      Scanner scanner = new Scanner(file);
      int i = 0;
      while (scanner.hasNext()) {
        array[i++] = scanner.next();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  protected void printArray(String[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) System.out.print(array[i]);
      else System.out.print(array[i] + delimiter);
    }
    System.out.println();
  }

  protected void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) System.out.print(array[i]);
      else System.out.print(array[i] + delimiter);
    }
    System.out.println();
  }

}
