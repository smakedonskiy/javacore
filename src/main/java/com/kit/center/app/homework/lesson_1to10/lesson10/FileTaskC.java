package com.kit.center.app.homework.lesson_1to10.lesson10;

import java.io.File;

public class FileTaskC extends FileIO {

  {
    super.name += "\"Write some text\"";
    super.description += "This program writes some text";
  }

  @Override
  public void run() {
    super.run();

    System.out.print("Input a file name: ");
    String fileName = sc.next();
    String filePath = "D:/" + fileName + ".txt";
    System.out.print("Input some text: ");
    String text = sc.next();

    File fileInput = new File(filePath);
    writeToFile(fileInput, text);
    System.out.println("You may see your text in the file: " +
            "\"" + filePath + "\"");

    quit();
  }
}
