package com.kit.center.app.homework.lesson_1to10.lesson10;

import java.io.*;


public class FileTaskA extends FileIO {
    private static final int MAX_NUMBER = 100;
    private static final int ARRAY_LENGTH = 10;
    private int[] arrayNumbers = new int[ARRAY_LENGTH];

    private String inputFileName = "D:/inputTaskA.txt";
    private String outputFileName = "D:/outputTaskA.txt";
    private File fileInput = new File(inputFileName);
    private File fileOutput = new File(outputFileName);

    {
        super.name += "\"Sort numbers\"";
        super.description += "This program reads numbers array from\n" +
                "* the file, sorts them and writes to new file.";
    }

    @Override
    public void run() {
        super.run();

        createArrNumbers();
        writeToFile(fileInput, arrayNumbers);

        readFromFile(fileInput, arrayNumbers);
        System.out.print(" Input array: ");
        printArray(arrayNumbers);

        sortArrNumber();
        writeToFile(fileOutput, arrayNumbers);
        System.out.print("Sorted array: ");
        printArray(arrayNumbers);

        quit();
    }

    private void createArrNumbers(){
        for (int i = 0; i < arrayNumbers.length; i++){
            arrayNumbers[i] = (int) (Math.random() * MAX_NUMBER);
        }
    }



    private void sortArrNumber(){
        for (int i = arrayNumbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayNumbers[j] > arrayNumbers[j + 1]) {
                    int t = arrayNumbers[j];
                    arrayNumbers[j] = arrayNumbers[j + 1];
                    arrayNumbers[j + 1] = t;
                }
            }
        }
    }


}
