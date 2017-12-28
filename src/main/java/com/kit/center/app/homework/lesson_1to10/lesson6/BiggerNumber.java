package com.kit.center.app.homework.lesson_1to10.lesson6;

import com.kit.center.app.homework.service.ATask;


public class BiggerNumber extends ATask {

  private int numberA, numberB;

  {
    super.name += "\"The bigger number\"";
    super.description += "You can input two integer\n" +
            "* numbers and get the bigger number.";
  }


  @Override
  public void run() {
    super.run();

    System.out.print("Input first number: ");
    setNumberA(sc.nextInt());
    System.out.print("Input second number: ");
    setNumberB(sc.nextInt());
    System.out.println(getResult());

    quit();
  }

  public String getResult() {
    String result = "";
    if (getNumberA() == getNumberB()) {
      result = (getNumberA() + " is equals " + getNumberB());
    } else if (getNumberA() > getNumberB()) {
      result = (getNumberA() + " is bigger then " + getNumberB());
    } else {
      result = (getNumberB() + " is bigger then " + getNumberA());
    }
    return result;
  }


  public void setNumberA(int numberA) {
    this.numberA = numberA;
  }

  public void setNumberB(int numberB) {
    this.numberB = numberB;
  }

  public int getNumberA() {
    return numberA;
  }

  public int getNumberB() {
    return numberB;
  }

}
