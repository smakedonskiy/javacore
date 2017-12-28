package com.kit.center.app.homework.lesson_11to20.lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Category implements Comparable<Category> {
  private String name;
  private ArrayList<Line> lines;
  Scanner sc = new Scanner(System.in);

  public Category(String name) {
    setName(name);
    lines = new ArrayList<>();
  }

  public void showMenu() {
    String menuMessage = "\n:) The category => " + name + "\n" +
            "0 - back\n" +
            "1 - show the list of contacts\n" +
            "2 - create new contact\n" +
            "3 - edit the contact\n" +
            "4 - search the contact";
    System.out.println(menuMessage);
    System.out.print("Input your number: ");
    chooseCommand(sc.nextInt());
  }

  public void chooseCommand(int userInput) {
    switch (userInput) {
      case 0:
        new BookMenu().showMenu();
        break;
      case 1:
        showListOfLines();
        break;
      case 2:
        System.out.print("Input a contact name: ");
        String lineName = sc.next();
        System.out.print("Input a contact number: ");
        int lineNumber = sc.nextInt();
        createLine(lineName, lineNumber);
        break;
      case 3:
        System.out.print("Input old name or number: ");
        String oldValue = sc.next();
        if (isContact(oldValue) == true) {
          System.out.print("Input new name or number: ");
          editLine(oldValue, sc.next());
        } else System.out.println("Contact is wrong!");
        break;
      case 4:
        System.out.print("Input your search: ");
        searchLine(sc.next());
        break;
    }
  }

  private void showListOfLines() {
    System.out.println("\n=> List from category: " + name);
    if (lines.size() == 0) {
      System.out.println("no list\n");
    } else {
      sortLines();
      for (Line line : lines) {
        System.out.println(line);
      }
    }
  }

  private void createLine(String name, int number) {
    lines.add(new Line(name, number));
    showListOfLines();
  }

  private void editLine(String oldValue, String newValue) {
    for (Line line : lines) {
      if (line.getName().toUpperCase().equals(oldValue.toUpperCase())) {
        line.setName(newValue);
      } else if (String.valueOf(line.getNumber()).equals(oldValue)) {
        line.setNumber(Integer.parseInt(newValue));
      }
      break;
    }
    showListOfLines();
  }

  private boolean isContact(String value) {
    boolean result = false;
    for (Line line : lines) {
      if (line.getName().toUpperCase().equals(value.toUpperCase()) ||
              String.valueOf(line.getNumber()).equals(value)) {
        result = true;
      }
      break;
    }
    return result;
  }

  public void searchLine(String word) {
    System.out.println("\n=> Finded:");
    for (Line line : lines) {
      if (line.getName().contains(word.toUpperCase()) ||
              String.valueOf(line.getNumber()).contains(word)) {
        System.out.println(line);
      }
    }
  }

  private void sortLines() {
    Collections.sort(lines, new Comparator<Line>() {
      @Override
      public int compare(Line o1, Line o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name.toUpperCase();
  }

  @Override
  public int compareTo(Category that) {
    return this.name.compareTo(that.name);
  }

  @Override
  public String toString() {
    return "# " + name;
  }
}
