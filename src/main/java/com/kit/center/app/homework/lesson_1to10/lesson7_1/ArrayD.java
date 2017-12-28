package com.kit.center.app.homework.lesson_1to10.lesson7_1;

public class ArrayD {
    private int array[] = new int[15];

    public void createArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
    }

    public void printArray() {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    public void printMinElementOfArray() {
        System.out.println("The min element of array: " + searchMinElementOfArray());
    }

    public void printMaxElementOfArray() {
        System.out.println("The max element of array: " + searchMaxElementOfArray());
    }

    private int searchMinElementOfArray() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    private int searchMaxElementOfArray() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

}
