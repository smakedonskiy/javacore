package com.kit.center.app.homework.lesson_1to10.lesson7_1;

import java.util.Random;

public class ArrayE {
    private int countLine = 8, countColumn = 5;
    private int array[][] = new int[countLine][countColumn];

    public void createArray(){
        Random random = new Random();
        for (int i = 0; i < countLine; i++){
            for (int j = 0; j < countColumn; j++){
                array[i][j] = random.nextInt(90) + 10;
            }
        }
    }

    public void printArray(){
        for (int i = 0; i < countLine; i++){
            for (int j = 0; j < countColumn; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
