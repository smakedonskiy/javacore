package com.kit.center.app.homework.lesson_1to10.lesson6;

import com.kit.center.app.homework.service.ATask;


public class CircleArea extends ATask {

  private int radius = -1;

  {
    super.name += "\"The circle area\"";
    super.description += "You can input an integer\n"
          + "* number and get the circle area.";
  }


  @Override
  public void run() {
    super.run();

    System.out.print("Input a radius: ");
    setRadius(sc.nextInt());
    System.out.println(getResult());

    quit();
  }

  public String getResult() {
    String result = "";
    if (getArea() > 0) result = "The circle area is: " + getArea();
    return result;
  }

  private int getArea() {
    int area = -1;
    if (getRadius() > 0) {
      area = (int) (Math.PI * Math.pow(getRadius(), 2));
    }
    return area;
  }


  public void setRadius(int radius) {
    if (radius < 0) {
      System.out.println("ERROR! You try input a radius < 0.");
    } else if (radius == 0) {
      System.out.println("ERROR! You try input a radius equals 0.");
    } else this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

}
