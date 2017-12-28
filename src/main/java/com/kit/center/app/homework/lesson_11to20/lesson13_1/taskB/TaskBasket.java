package com.kit.center.app.homework.lesson_11to20.lesson13_1.taskB;

import com.kit.center.app.homework.service.ATask;

public class TaskBasket extends ATask {

  AFlower[] flowers = {new Rose(), new Rose(),
          new Rose(), new Carnation(), new Carnation(),
          new Tulip(), new Peony()};

  {
    super.name += "\"Flower basket\"";
    super.description += "Create flower basket and get its cost";
  }

  @Override
  public void run() {
    super.run();
    printCostOfBasket();
    quit();
  }

  private void printCostOfBasket() {
    int cost = 0;
    for (AFlower f : flowers) {
      cost += f.cost;
    }
    System.out.println(flowers.length + " flowers: " + printFlowerNames());
    System.out.println("cost = " + cost);
  }

  private String printFlowerNames() {
    String str = "";
    for (AFlower f : flowers) {
      str += (f.name + ", ");
    }
    return str;
  }


}
