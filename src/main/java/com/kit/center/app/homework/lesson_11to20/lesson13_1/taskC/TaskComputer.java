package com.kit.center.app.homework.lesson_11to20.lesson13_1.taskC;

import com.kit.center.app.homework.service.ATask;

public class TaskComputer extends ATask {

  {
    super.name += "\"Computer\"";
    super.description += "This program changes CPU";
  }

  Computer[] computers = new Computer[2];

  @Override
  public void run() {
    super.run();

    Computer lenovo = new Lenovo();
    Computer dell = new Dell();

    computers[0] = lenovo;
    computers[1] = dell;

    changesForComputersArray();

    quit();
  }

  private void changesForComputersArray(){
    for (Computer computer : computers){
      computer.changeCPU();
    }
  }


}
