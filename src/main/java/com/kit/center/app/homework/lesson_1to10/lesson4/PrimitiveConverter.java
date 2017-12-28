package com.kit.center.app.homework.lesson_1to10.lesson4;

import com.kit.center.app.homework.service.ATask;


public class PrimitiveConverter extends ATask {

  private String typeInput, typeOutput;
  private String valueInput, valueOutput;

  {
    super.name += "\"Primitive converter\"";
    super.description += "This program shows casting\n" +
            "* double or int to char and char to int.";
  }


  @Override
  public void run() {
    super.run();

    castToChar(65.35);
    System.out.println(getResult());
    castToChar(33);
    System.out.println(getResult());
    castToInt('B');
    System.out.println(getResult());

    quit();
  }

  private String getResult() {
    String result = "Input " + getTypeInput() + " value is: " + getValueInput() +
            "\nOutput " + getTypeOutput() + " value is: " + getValueOutput() +
            "\n=======     =======";
    return result;
  }

  private void castToChar(double doubleValue) {
    typeInput = "double";
    typeOutput = "char";
    valueInput = String.valueOf((float) doubleValue);
    valueOutput = String.valueOf((char) doubleValue);
  }

  private void castToChar(int intValue) {
    typeInput = "int";
    typeOutput = "char";
    valueInput = String.valueOf(intValue);
    valueOutput = String.valueOf((char) intValue);
  }

  private void castToInt(char charValue) {
    typeInput = "char";
    typeOutput = "int";
    valueInput = String.valueOf(charValue);
    valueOutput = String.valueOf((int) charValue);
  }


  public String getTypeInput() {
    return typeInput;
  }

  public String getTypeOutput() {
    return typeOutput;
  }

  public String getValueInput() {
    return valueInput;
  }

  public String getValueOutput() {
    return valueOutput;
  }


}
