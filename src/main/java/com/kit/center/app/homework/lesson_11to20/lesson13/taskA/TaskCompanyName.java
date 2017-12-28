package com.kit.center.app.homework.lesson_11to20.lesson13.taskA;

import com.kit.center.app.homework.service.ATask;

import java.util.InputMismatchException;

public class TaskCompanyName extends ATask {

  {
    super.name += "\"Company name\"";
    super.description += "This program checks company name.\n" +
            "* You must input only a-Z, '-', ' ', ','";
  }

  @Override
  public void run() {
    super.run();

    System.out.print("Input name: ");
    String name = sc.next();
    System.out.print("Input age: ");
    int age = 0;
    try {
      age = sc.nextInt();
    }catch (InputMismatchException e){
      System.out.println("ERROR! Do not a number.");
      run();
    }
    System.out.print("Input company name: ");
    String companyName = sc.next();
    new WhiteCollar(name,age,companyName);

    quit();
  }
}
