package com.kit.center.app.homework.lesson_11to20.lesson14.taskC;

import java.util.ArrayList;
import java.util.List;

public class Flat {

  private List<EThing> thingsList = new ArrayList<>();

  public void buyThing(EThing thing) {
    thingsList.add(thing);
  }


  public void printThings() {
    System.out.print("\nThings in the flat: ");
    for (EThing thing : thingsList) {
      System.out.print(thing + " ");
    }
    System.out.println("\nThe Flat has some things => This is an \"aggregation\".");
  }

}
