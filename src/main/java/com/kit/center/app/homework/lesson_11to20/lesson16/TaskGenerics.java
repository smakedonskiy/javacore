package com.kit.center.app.homework.lesson_11to20.lesson16;

import com.kit.center.app.homework.service.ATask;

import java.util.Arrays;


public class TaskGenerics extends ATask {

  {
    super.name += "\"Array sorter Generics\"";
    super.description += "This program shows a work of generics";
  }


  @Override
  public void run() {
    super.run();
    Integer[] intArray = {2,-3,0,5,1,9,-7};
    Double[] doubleArray = {2.6, -0.25, -0.27};
    Integer[] intArray2 = {12,-23,100,25,17,-19,7};
    Double[] doubleArray2 = {22.6, -10.25, -23.27};

    System.out.println("We have some arrays of numbers:" +
            "\nArray1: " + Arrays.toString(intArray) +
            "\nArray2: " + Arrays.toString(doubleArray) +
            "\nArray3: " + Arrays.toString(intArray2) +
            "\nArray4: " + Arrays.toString(doubleArray2));

    System.out.println("\nSorting arrays using an instance of the class:");
    ArraySorterGenerics sortInt = new ArraySorterGenerics(intArray);
    sortInt.sort();
    System.out.println("Array1: " +
            Arrays.toString(sortInt.getNumberArray()));
    ArraySorterGenerics sortDouble = new ArraySorterGenerics(doubleArray);
    sortDouble.sort();
    System.out.println("Array2: " +
            Arrays.toString(sortDouble.getNumberArray()));

    System.out.println("\nSorting arrays using the static method:");
    System.out.println("Array3: " +
            Arrays.toString(ArraySorterGenerics.sort(intArray2)));
    System.out.println("Array4: " +
            Arrays.toString(ArraySorterGenerics.sort(doubleArray2)));

    quit();
  }

}
