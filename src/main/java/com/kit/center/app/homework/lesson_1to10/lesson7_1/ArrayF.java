package com.kit.center.app.homework.lesson_1to10.lesson7_1;

import java.util.Random;

public class ArrayF {
    private int countLine = 8, countColumn = 5;
    private int array[][] = new int[countLine][countColumn];

    public void createArray(){
        Random random = new Random();
        for (int i = 0; i < countLine; i++){
            for (int j = 0; j < countColumn; j++){
                array[i][j] = 1 + random.nextInt(1000 - 1);
            }
        }
    }

    public void printArray(){
        for (int i = 0; i < countLine; i++){
            for (int j = 0; j < countColumn; j++){
                System.out.printf("%3d", array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
