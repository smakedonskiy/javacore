package com.kit.center.app.homework.lesson_11to20.lesson13.taskA;

public class WhiteCollar extends Human {

  private String companyName;

  public WhiteCollar(String name, int age, String companyName) {
    super(name, age);
    setCompanyName(companyName);
  }

  public void setCompanyName(String companyName) {
    if (checkCompanyName(companyName) == true) {
      this.companyName = companyName;
      System.out.println("Company name saved");
    } else {
      System.out.println("Company name is invalid");
    }
  }

  private boolean checkCompanyName(String companyName) {
    boolean result = false;
    char[] nameArray = companyName.toCharArray();
    char[] trueArray = new char[companyName.length()];

    for (int i = 0, j = 0; i < nameArray.length; i++, j++) {
      if ((nameArray[i] >= 65 && nameArray[i] <= 90) ||
              (nameArray[i] >= 97 && nameArray[i] <= 122) ||
              nameArray[i] == 44 ||
              nameArray[i] == 45 ||
              nameArray[i] == 32) {
        trueArray[j] = 1;
      }
      if (trueArray[companyName.length() - 1] == 1) {
        result = true;
      }
    }
    return result;
  }


}