package com.kit.center.app.homework.lesson_1to10.lesson10;

import java.io.File;

public class FileTaskB extends FileIO {

    private static final int ARRAY_LENGTH = 7;
    private String[] arrayWords = new String[ARRAY_LENGTH];

    private String inputFileName = "D:/inputTaskB.txt";
    private String outputFileName = "D:/outputTaskB.txt";
    private File fileInput = new File(inputFileName);
    private File fileOutput = new File(outputFileName);


    {
        super.name += "\"The polindrome list\"";
        super.description += "This program reads words from\n" +
                "* the file, checks them and writes to new file.";
    }

    @Override
    public void run() {
        super.run();

        readFromFile(fileInput,arrayWords);
        System.out.print("Input words: ");
        printArray(arrayWords);

        checkPolindrome();

        writeToFile(fileOutput,arrayWords);
        System.out.print("Check words: ");
        printArray(arrayWords);

        quit();
    }

    private void checkPolindrome(){
        for (int i = 0; i < ARRAY_LENGTH; i++){
            boolean result = arrayWords[i].equals(new StringBuffer(arrayWords[i]).reverse().toString());
            if (result == true){
                arrayWords[i] += " is polindrome";
            }else arrayWords[i] += " is not";
        }
    }

}
