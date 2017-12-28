package com.kit.center.runners.classwork.lesson_11to20.lesson11;

import java.io.*;

public class Lesson11 {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "dir\\somefile.txt";
        File file = new File(currentDir, windowsStyle);
        System.out.println(file.getAbsolutePath());

        String firstLine = "The first line 2";
        String secondLine = "The second line 2";
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("somefile.txt")));

            writer.append(firstLine);
            writer.newLine();
            writer.append(secondLine);
            writer.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
