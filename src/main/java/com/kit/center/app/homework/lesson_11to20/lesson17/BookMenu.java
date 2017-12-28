package com.kit.center.app.homework.lesson_11to20.lesson17;

import com.kit.center.runners.homework.total.TotalController;

import java.util.Scanner;
import java.util.TreeSet;

public class BookMenu {
  TreeSet<Category> categories = new TreeSet<>();
  Scanner sc = new Scanner(System.in);

  public void showMenu() {
    String menuMessage = "\n:) M E N U\n" +
            "0 - exit\n" +
            "1 - show the list of categories\n" +
            "2 - create new category\n" +
            "3 - edit the category\n" +
            "4 - open the category\n" +
            "5 - search the contact";
    System.out.println(menuMessage);
    System.out.print("Input your number: ");
    chooseCommand(sc.nextInt());
  }

  public void chooseCommand(int userInput) {
    switch (userInput) {
      case 0:
        new TotalController().start();
        break;
      case 1:
        showListOfCategories();
        break;
      case 2:
        System.out.print("Input a category name: ");
        createCategory(sc.next());
        break;
      case 3:
        System.out.print("Input old name of category: ");
        String oldValue = sc.next();
        if (isContact(oldValue) == true) {
          System.out.print("Input new name of category: ");
          editCategory(oldValue, sc.next());
        } else System.out.println("Contact is wrong!");
        break;
      case 4:
        System.out.print("Input a category name: ");
        openCategory(sc.next());
        break;
      case 5:
        System.out.print("Input your search: ");
        searchLine(sc.next());
        break;
    }
  }

  private void searchLine(String word) {
    System.out.println("\n=> Finded:");
    for (Category category : categories) {
      category.searchLine(word);
    }
  }

  private void openCategory(String name) {
    for (Category category : categories) {
      if (category.getName().toUpperCase().equals(name.toUpperCase())) {
        category.showMenu();
      }
    }
  }

  private void editCategory(String oldValue, String newValue) {
    for (Category category : categories) {
      if (category.getName().toUpperCase().equals(oldValue.toUpperCase())) {
        category.setName(newValue);
      }
      break;
    }
    showListOfCategories();
  }

  private boolean isContact(String value) {
    boolean result = false;
    for (Category category : categories) {
      if (category.getName().toUpperCase().equals(value.toUpperCase())) {
        result = true;
      }
      break;
    }
    return result;
  }

  private void createCategory(String categoryName) {
    categories.add(new Category(categoryName));
    showListOfCategories();
  }

  private void showListOfCategories() {
    System.out.println("\n=> List of categories:");
    if (categories.size() == 0) {
      System.out.println("no list\n");
    } else {
      for (Category category : categories) {
        System.out.println(category);
      }
    }
  }


}
