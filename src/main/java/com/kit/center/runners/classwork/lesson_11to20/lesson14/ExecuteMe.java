package com.kit.center.runners.classwork.lesson_11to20.lesson14;

import com.kit.center.app.classwork.lesson_11to20.lesson14.task1.ACMEBicycle;
import com.kit.center.app.classwork.lesson_11to20.lesson14.task1.Bicycle;

public class ExecuteMe {
  public static void main(String[] args) {
    Bicycle bicycle1 = new ACMEBicycle();
    Bicycle bicycle2 = new ACMEBicycle();
    init(bicycle1,2,3,124);
    init(bicycle2,5,4,359);

    ACMEBicycle bicycle3 = (ACMEBicycle) bicycle1;
    bicycle3.printStates();


  }

  public static void init (Bicycle bicycle, int cadence, int gear, int id){
    bicycle.printID(id);
    bicycle.changeCadence(cadence);
    bicycle.changeGear(gear);
  }

}
