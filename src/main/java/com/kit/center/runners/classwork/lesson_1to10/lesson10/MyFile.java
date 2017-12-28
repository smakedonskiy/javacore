package com.kit.center.runners.classwork.lesson_1to10.lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFile {

    public void start() {
        String filePath = getFilePath("classwork/input.txt");
        System.out.println(filePath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }

    public String getFilePath(String fileName) {
        return getClass().getClassLoader().getResource(fileName).getPath();
    }

}
