package com.kit.center.app.homework.lesson_11to20.lesson17;

import com.kit.center.app.homework.service.ATask;

import java.util.TreeSet;


public class TaskPhoneBook extends ATask {

  {
    super.name += "\"Phone book\"";
    super.description += "This program shows a work of collections";
  }

  private BookMenu menu = new BookMenu();

  @Override
  public void run() {
    menu.showMenu();

    quit();
  }

}
