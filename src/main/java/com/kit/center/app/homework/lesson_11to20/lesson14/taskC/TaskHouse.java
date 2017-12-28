package com.kit.center.app.homework.lesson_11to20.lesson14.taskC;

import com.kit.center.app.homework.service.ATask;

public class TaskHouse extends ATask {

  {
    super.name += "\"House\"";
    super.description += "This program shows an aggregation and a composition";
  }

  @Override
  public void run() {
    super.run();

    House house = new House(new Flat());

    house.getFlat().buyThing(EThing.TABLE);
    house.getFlat().buyThing(EThing.LAMP);
    house.getFlat().buyThing(EThing.CHAIR);
    house.getFlat().buyThing(EThing.CHAIR);
    house.getFlat().buyThing(EThing.BED);
    house.getFlat().buyThing(EThing.TV);
    house.getFlat().printThings();

    quit();
  }
}
