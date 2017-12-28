package com.kit.center.app.homework.lesson_11to20.lesson14.taskA;

import com.kit.center.app.homework.service.ATask;

public class TaskTractor extends ATask {

  {
    super.name += "\"Tractor\"";
    super.description += "This program shows information about some tractor.";
  }

  @Override
  public void run() {
    super.run();

    Tractor belarus = new WheeledTractor("Belarus", 40, 1365, 4, 1);
    Tractor kiroves = new WheeledTractor("Kiroves", 35, 2030, 6, 0);
    Tractor t35 = new CaterpillarTractor("T-35", 10, 1800,0, 1);
    belarus.printTractorInfo();
    kiroves.printTractorInfo();
    t35.printTractorInfo();

    quit();
  }
}
