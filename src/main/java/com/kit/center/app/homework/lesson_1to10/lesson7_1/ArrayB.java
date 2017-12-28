package com.kit.center.app.homework.lesson_1to10.lesson7_1;

public class ArrayB {
    private int array[] = new int[50];

    public void createArray() {
        for (int i = 0, j = 1; i <= array.length && j <= 99; j++) {
            if (j % 2 != 0) {
                array[i] = j;
                i++;
            }
        }
    }

    public void printLineArray() {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    public void printLineReversArray(){
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}
