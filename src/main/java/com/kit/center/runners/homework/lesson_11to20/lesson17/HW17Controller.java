package com.kit.center.runners.homework.lesson_11to20.lesson17;

import com.kit.center.app.homework.lesson_11to20.lesson17.TaskPhoneBook;
import com.kit.center.app.homework.service.AHomework;

public class HW17Controller extends AHomework {

  {
    super.name += "17. ";
    super.description += "\"Collections\".";
  }

  TaskPhoneBook phoneBook = new TaskPhoneBook();

  @Override
  public void run() {
    super.run();
    phoneBook.run();
  }
}
