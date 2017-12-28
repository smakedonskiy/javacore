package com.kit.center.app.homework.lesson_1to10.lesson7_1;

import java.util.Scanner;

public class ArrayG {
    private int array[] = new int[50];

    public void createArray() {
        boolean closeProgram = false;
        for (int i = 0; i < array.length && closeProgram == false; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input your number: ");
            String message = scanner.next();
            if (message.equals("exit"))
                closeProgram = true;
            if (closeProgram == false) {
                array[i] = Integer.parseInt(message);
            }
        }
    }

    public void printSumAllElementsOfArray() {
        System.out.println("The sum of all your numbers: " + sumAllElementsOfArray());
    }

    private int sumAllElementsOfArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
