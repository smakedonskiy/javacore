package com.kit.center.app.homework.z_help;

import java.util.*;


public class ZMenu {
  Scanner sc = new Scanner(System.in);
  private TreeSet<ZCategory> categories = new TreeSet<>();
  public boolean work = true;

  public void createCategory(String categoryName) {
    categories.add(new ZCategory(categoryName));
  }

  public void showCategories() {
    System.out.println("List of categories:");
    if (categories.size() == 0) {
      System.out.println("=> the list is empty");
    } else {
      for (ZCategory category : categories) {
        System.out.println("# " + category.getName());
      }
    }
  }


  public void showHelp() {
    String helpMessage = "\nM E N U\n" +
            "0 - exit\n" +
            "1 - list of categories\n" +
            "2 - create category\n" +
            "3 - open category";
    System.out.println(helpMessage);
  }

  public void chooseProg(int userInput){
    switch (userInput){
      case 0:
        work = false;
        break;
      case 1:
        showCategories();
        break;
      case 2:
        System.out.print("Input new name of category: ");
        createCategory(sc.next());
        break;
      case 3:
        System.out.print("Input the name of category: ");
        openCategory(sc.next());
        break;
    }
  }



  public void openCategory(String categoryName){
    for (ZCategory category : categories){
      if (category.getName().equals(categoryName)){
        category.showHelp();
        break;
      }
    }
  }
}
