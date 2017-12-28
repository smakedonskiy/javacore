package com.kit.center.app.homework.lesson_1to10.lesson7_1;

public class ArrayC {
    private int array[] = new int[15];

    public void createArray(){
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
    }

    public void printArray(){
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

    public void printCountPairElementsOfArray(){
        System.out.println("The count of pair numbers: " + countPairElementsOfArray());
    }

    public void printCountZeroElementsOfArrey(){
        System.out.println("The count of zero numbers: " + countZeroElementsOfArray());
    }

    private int countPairElementsOfArray(){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] %2 == 0)
                count++;
        }
        return count;
    }

    private int countZeroElementsOfArray() {
        int countZero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                countZero++;
        }
        return countZero;
    }
}
