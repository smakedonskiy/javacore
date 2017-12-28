package com.kit.center.app.homework.lesson_1to10.lesson6;

import com.kit.center.app.homework.service.ATask;


public class Triangle extends ATask {

  private int a = -1, b = -1, c = -1;

  private String errorMessageEquals0 = "* ERROR! You try input a number equals 0.";
  private String errorMessageLess0 = "* ERROR! You try input a number < 0.";
  private String messageRightTriangle = "This triangle is right-angled.";
  private String messageNotRightTriangle = "This triangle is not right-angled.";

  {
    super.name += "\"The right angled triangle\"";
    super.description += "You can input a three integer\n" +
            "* numbers and get message about the triangle.";
  }


  @Override
  public void run() {
    super.run();

    System.out.print("Input a: ");
    setA(sc.nextInt());
    System.out.print("Input b: ");
    setB(sc.nextInt());
    System.out.print("Input c: ");
    setC(sc.nextInt());
    System.out.println(getResult());

    quit();
  }

  public String getResult() {
    String result = "";
    if (checkTriangle() == true) {
      result = messageRightTriangle;
    } else {
      result = messageNotRightTriangle;
    }
    return result;
  }


  private boolean checkTriangle() {
    boolean result = false;
    if (Math.round(Math.pow(getC(), 2)) == Math.round(Math.pow(getA(), 2) + Math.pow(getB(), 2))) {
      result = true;
    }
    return result;
  }

  public void setA(int a) {
    if (a < 0) System.out.println(errorMessageLess0);
    else if (a == 0) System.out.println(errorMessageEquals0);
    else this.a = a;
  }

  public void setB(int b) {
    if (b < 0) System.out.println(errorMessageLess0);
    else if (b == 0) System.out.println(errorMessageEquals0);
    else this.b = b;
  }

  public void setC(int c) {
    if (c < 0) System.out.println(errorMessageLess0);
    else if (c == 0) System.out.println(errorMessageEquals0);
    else this.c = c;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }


}
