package com.kit.center.app.homework.lesson_1to10.lesson7_1;


public class ArrayA {

    private int array[] = new int[10];

    public void createArray(){
        for (int i = 0, j = 1; i <= array.length && j <= 20; j++){
            if (j%2 == 0){
                array[i] = j;
                i++;
            }
        }
    }

    public void printLineArray(){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void printColumnArray(){
        for (int i : array){
            System.out.println(i);
        }
    }

}
